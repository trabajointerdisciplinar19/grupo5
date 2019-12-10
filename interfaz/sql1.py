 CREATE OR ALTER PROC usp_ExportExcel (@ExportPath NVARCHAR(MAX),
                                      @SchemaName NVARCHAR(MAX),
                                      @ObjectlisttoExport NVARCHAR(MAX)
                                      )
AS
BEGIN
SET NOCOUNT ON;
BEGIN TRY
  
IF ISNULL(@ExportPath,'') <> ''
 BEGIN
 SELECT @ExportPath = CASE WHEN RIGHT(@ExportPath,1) = '\' THEN @ExportPath ELSE CONCAT(@ExportPath,'\') END
 DECLARE @ValidPath TABLE (ValidPathCheck BIT)
INSERT @ValidPath
EXEC sp_execute_external_script
@language =N'Python',
@script=N'
import pandas as pd
d = os.path.isdir(ExportFilePath)
OutputDataSet = pd.DataFrame(d,columns=["Filename"])'
,@params = N'@ExportFilePath NVARCHAR(MAX)'
,@ExportFilePath = @ExportPath
        IF (SELECT ValidPathCheck FROM @ValidPath) = 1
BEGIN
  
 IF ISNULL(@SchemaName,'') <> ''  OR ISNULL(@ObjectlisttoExport,'') <> ''
 BEGIN
    
DROP TABLE IF EXISTS #ExportTablesList, #FinalExportList
  
CREATE TABLE #ExportTablesList(TableCount INT IDENTITY(1,1),Cols NVARCHAR(MAX),TableName NVARCHAR(200))
--Get the list of objects to be exported
INSERT #ExportTablesList (Cols,TableName)
SELECT  CASE WHEN TY.name IN ('date','datetime2','datetimeoffset','time','timestamp','decimal','bit','int','bigint')
               THEN CONCAT('TRY_CONVERT(','VARCHAR(MAX),',C.name,') AS ',QUOTENAME(C.NAME))
          ELSE C.name END Cols  -- To cover poor data type conversions b/n Python & SQL Server
  ,CONCAT(SCHEMA_NAME(T.SCHEMA_ID),'.',T.name) TableName
FROM Sys.tables T
JOIN sys.columns C
ON T.object_id = C.object_id
JOIN sys.types TY
ON C.[user_type_id] = TY.[user_type_id]
WHERE Schema_name(T.schema_id) IN (SELECT value FROM STRING_SPLIT(@SchemaName, ','))
-- Ignore the datatypes that are not required to be exported
AND TY.name NOT IN ('geography','varbinary','binary','text', 'ntext', 'image', 'hierarchyid', 'xml', 'sql_variant') 
  
INSERT #ExportTablesList (Cols,TableName)
SELECT  CASE WHEN TY.name IN ('date','datetime2','datetimeoffset','time','timestamp','decimal','bit','int','bigint')
               THEN CONCAT('TRY_CONVERT(','VARCHAR(MAX),',C.name,') AS ',QUOTENAME(C.NAME))
          ELSE C.name END Cols  -- To cover poor data type conversions b/n Python & SQL Server
  ,CONCAT(SCHEMA_NAME(T.SCHEMA_ID),'.',T.name) TableName
FROM Sys.tables T
JOIN sys.columns C
ON T.object_id = C.object_id
JOIN sys.types TY
ON C.[user_type_id] = TY.[user_type_id]
WHERE CONCAT(SCHEMA_NAME(T.SCHEMA_ID),'.',T.name) IN (SELECT value FROM STRING_SPLIT(@ObjectlisttoExport, ','))
-- Ignore the datatypes that are not required to be exported
AND TY.name NOT IN ('geography','varbinary','binary','text', 'ntext', 'image', 'hierarchyid', 'xml', 'sql_variant') 
  
--Dedup of object list
;WITH dedup
AS
(
SELECT *,ROW_NUMBER()OVER(PARTITION BY TableName,Cols ORDER BY Cols) Rn FROM #ExportTablesList
)
DELETE FROM dedup
WHERE Rn > 1
--Forming columns list as comma separated
SELECT TableName,IDENTITY(INT,1,1) AS TableCount
    , STUFF(
        (
        SELECT ', ' + C.Cols
        From #ExportTablesList As C
        WHERE C.TableName = T.TableName
        FOR XML PATH('')
        ), 1, 2, '') AS Cols
INTO #FinalExportList
From #ExportTablesList As T
GROUP BY TableName
  
  
DECLARE @I INT = 1
       ,@TableName NVARCHAR(200)
       ,@SQL NVARCHAR(MAX) = N''
       ,@PythonScript NVARCHAR(MAX) = N''
       ,@ExportFilePath NVARCHAR(MAX) = N''
--Loop through the object list to export as excel   
WHILE @I <= (SELECT COUNT(TableName) FROM #FinalExportList)
BEGIN
   
 -- Just for testing purpose top 10 records are selected
SELECT @SQL = CONCAT('SELECT TOP 10 ',Cols,' FROM ',TableName,';')
      ,@TableName = TableName
FROM #FinalExportList WHERE TableCount = @I
  
   
SET @PythonScript = N'
FullFilePath = ExcelFilePath+TableName+".xlsx"
InputDataSet.to_excel(FullFilePath,sheet_name=TableName.split(".")[-1],index=False)'
   
EXEC   sp_execute_external_script
      @language = N'Python'
     ,@script = @PythonScript
     ,@input_data_1 = @SQL
     ,@params = N'@ExcelFilePath NVARCHAR(MAX), @TableName NVARCHAR(200)'
     ,@ExcelFilePath = @ExportPath -- file path where Excel files are placed
     ,@TableName = @TableName
  
   
SET @I = @I + 1
END
  
 END ELSE PRINT 'Schema name of objects or list of objects (separated by comma) to be exported need to be mentioned'
 END ELSE PRINT 'Invalid folder path'
 END ELSE PRINT 'Export folder path need to be mentioned'
 END TRY
BEGIN CATCH
PRINT 'Issue while executing this SP, please check whether there is permission to execute the script / to access the folder and input params are valid'
END CATCH
  
END