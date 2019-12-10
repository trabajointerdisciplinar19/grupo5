 CREATE OR ALTER PROC usp_ImportExcel (@ImportPath NVARCHAR(MAX),
                                      @DBConnectionString NVARCHAR(MAX),
                                      @ImportAll BIT,
                      @CombineTarget BIT,
                                      @ExcelFileName NVARCHAR(200),
                                      @ExcelSheetName NVARCHAR(50)
                                      )
AS
BEGIN
SET NOCOUNT ON;
BEGIN TRY
  
IF ISNULL(@ImportPath,'') <> '' AND ISNULL(@DBConnectionString,'') <> ''
 BEGIN
 SELECT @ImportPath = CASE WHEN RIGHT(@ImportPath,1) = '\' THEN @ImportPath ELSE CONCAT(@ImportPath,'\') END
 DECLARE @Serv NVARCHAR(200) = CONCAT(CHAR(39),CHAR(39),@@SERVERNAME,CHAR(39),CHAR(39))
  DECLARE @ValidPath TABLE (ValidPathCheck BIT)
INSERT @ValidPath
EXEC sp_execute_external_script
@language =N'Python',
@script=N'
import pandas as pd
d = os.path.isdir(ImportFilePath)
OutputDataSet = pd.DataFrame(d,columns=["Filename"])'
,@params = N'@ImportFilePath NVARCHAR(MAX)'
,@ImportFilePath = @ImportPath
        IF (SELECT ValidPathCheck FROM @ValidPath) = 1
BEGIN
   
  IF (@ImportAll = 0 AND (ISNULL(@ExcelFileName,'') <> '' AND ISNULL(@ExcelSheetName,'') <> ''))
  OR (@ImportAll = 1 AND (ISNULL(@ExcelFileName,'') = '' AND ISNULL(@ExcelSheetName,'') = ''))
  
  BEGIN
        
     
DECLARE @PythonScript NVARCHAR(MAX) =CONCAT('
import pandas as pd
import os
import glob
from revoscalepy import RxSqlServerData, rx_data_step
sqlConnString = "Driver=SQL Server;Server=Serv; ',@DBConnectionString,'"
Filefolderepath = ImportFilePath+"*.xlsx"
if ImportAll ==1 and CombineTarget==0:
    for FullFilePath in glob.glob(Filefolderepath):
       Filename = os.path.basename(FullFilePath).replace(".xlsx","")
       xl = pd.ExcelFile(FullFilePath)
       for sheetname in xl.sheet_names:
          Output = pd.read_excel(FullFilePath, sheetname=sheetname, na_filter=False).astype(str)
       if not Output.empty:
          sqlDS = RxSqlServerData(connection_string = sqlConnString,table = "".join(fl for fl in Filename if fl.isalnum())+"_"+"".join(sh for sh in sheetname if sh.isalnum()))
          rx_data_step(input_data = Output, output_file = sqlDS,overwrite = True)
if ImportAll ==1 and CombineTarget==1:
   df2=pd.DataFrame()
   for FullFilePath in glob.glob(Filefolderepath):
       Filename = os.path.basename(FullFilePath).replace(".xlsx","")
       xl = pd.ExcelFile(FullFilePath)
       for sheetname in xl.sheet_names:
           Output = pd.read_excel(FullFilePath, sheetname=sheetname).columns.astype(str)
           Output = ",".join(list(Output))
           df1 = pd.DataFrame([[Filename,sheetname,FullFilePath,Output]],columns=["Filename","sheetname","FullFilePath","Headers"])
           df2=df2.append(df1,ignore_index=True)
   sqlDS = RxSqlServerData(connection_string = sqlConnString,table = "Tbl_PyImpExp1")
   rx_data_step(input_data = df2, output_file = sqlDS,overwrite = True)
if ImportAll ==0:
   Filename =ImportFilePath+ExcelFileName+".xlsx"
   exists = os.path.isfile(Filename)
   if exists and ExcelSheetName in pd.ExcelFile(Filename).sheet_names:
         Output = pd.read_excel(Filename, sheetname=ExcelSheetName, na_filter=False).astype(str)
         if not Output.empty:
             sqlDS = RxSqlServerData(connection_string = sqlConnString,table = "".join(fl for fl in ExcelFileName if fl.isalnum())+"_"+"".join(sh for sh in ExcelSheetName if sh.isalnum()))
             rx_data_step(input_data = Output, output_file = sqlDS,overwrite = True)
   else:
      print("Invalid Excel file or sheet name")')
  
EXEC   sp_execute_external_script
      @language = N'Python'
     ,@script = @PythonScript
     ,@params = N'@ImportFilePath NVARCHAR(MAX),@ImportAll BIT,@CombineTarget BIT,@ExcelFileName NVARCHAR(200),@ExcelSheetName NVARCHAR(50),@Serv NVARCHAR(200)'
     ,@ImportFilePath = @ImportPath
     ,@ImportAll = @ImportAll
     ,@CombineTarget = @CombineTarget
     ,@ExcelFileName = @ExcelFileName
     ,@ExcelSheetName = @ExcelSheetName
     ,@Serv = @Serv
     IF @ImportAll =1 AND @CombineTarget =1
     BEGIN
        IF OBJECT_ID('Tbl_PyImpExp1') IS NOT NULL
            BEGIN
                    DROP TABLE IF EXISTS Tbl_PyImpExp2
                    ;WITH FileList
                    As(
                    SELECT [Filename]
                          ,[sheetname]
                          ,[Headers]
                          ,[FullFilePath]
                          ,ROW_NUMBER()OVER(ORDER BY (SELECT 1)) Rn
                          ,ROW_NUMBER()OVER(PARTITION BY [Headers] ORDER BY [Headers]) Grp
                          ,DENSE_RANK()OVER(ORDER BY [Headers]) Grp1
                      FROM [dbo].[Tbl_PyImpExp1]
                      )
                      SELECT  *,FIRST_VALUE([Filename]) OVER (PARTITION BY Grp1 ORDER BY Grp ASC) AS TableName
                      INTO Tbl_PyImpExp2
                      FROM FileList
            END
                IF EXISTS (SELECT 1 FROM Tbl_PyImpExp2)
                BEGIN
                     DECLARE @I INT = 1
                            ,@SQL NVARCHAR(MAX) =N''
SET @PythonScript = CONCAT('
import pandas as pd
from revoscalepy import RxSqlServerData, rx_data_step
sqlConnString = "Driver=SQL Server;Server=Serv; ',@DBConnectionString,'"
if ImportAll ==1 and CombineTarget==1:
   FinalImport=pd.DataFrame()
   for index, row in InputDataSet.iterrows():
       Tbl = "".join(T for T in row["TableName"] if T.isalnum())
       Import = pd.read_excel(row["FullFilePath"], sheetname=row["sheetname"], na_filter=False).astype(str)
       Import["ImportKey"] = row["TableName"]+"_"+row["sheetname"]
       FinalImport=FinalImport.append(Import,ignore_index=True)
       if not FinalImport.empty:
          sqlDS = RxSqlServerData(connection_string = sqlConnString,table = Tbl)
          rx_data_step(input_data = FinalImport, output_file = sqlDS,overwrite = True)')
                     WHILE @I <= (SELECT MAX(Grp1) FROM Tbl_PyImpExp2)
                     BEGIN
                     SET @SQL =  CONCAT('SELECT FullFilePath,sheetname,TableName FROM Tbl_PyImpExp2 WHERE Grp1 = ',@I)
                         EXEC   sp_execute_external_script
                          @language = N'Python'
                         ,@script = @PythonScript
                         ,@input_data_1 = @SQL
                         ,@params = N'@ImportAll BIT,@CombineTarget BIT,@Serv NVARCHAR(200)'
                         ,@Serv = @Serv
                         ,@ImportAll = @ImportAll
                         ,@CombineTarget = @CombineTarget
                     SET @I = @I + 1
                     END
                 END
     DROP TABLE IF EXISTS Tbl_PyImpExp1,Tbl_PyImpExp2
     END
      
     END ELSE PRINT 'Invalid parameters: If ImportAll = 0 then pass Excel file & Sheet Name as input. If ImportAll = 1 then pass Excel file & Sheet Name blank'
   
  END ELSE PRINT 'Invalid folder path'
END ELSE PRINT 'Import folder path or database connection string need to be mentioned'
  
 END TRY
BEGIN CATCH
PRINT 'Issue while executing this SP, please check whether there is permission to execute the script / to access the folder and input params are valid'
END CATCH
END