# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'login.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!




#                                                                               Una miniguia de lo que es cada objeto esta retranslateUi

from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel, QApplication, QDialog

from registro import Ui_RegWindow
from recupera_cuenta import Ui_RecuperaWindow


class Ui_MainWindow(object):

    def openReg(self):
        self.window = QtWidgets.QMainWindow()
        self.ui = Ui_RegWindow()
        self.ui.setupUi(self.window)
        self.window.show()
        
    def openRecupera(self):
        self.window = QtWidgets.QMainWindow()
        self.ui = Ui_RecuperaWindow()
        self.ui.setupUi(self.window)
        self.window.show()
    """                                                                         Para entrar a una nueva aplicacion
    def entra_app(self):
        self.window = QtWidgets.QMainWindow()
        self.ui = Ui_"nombre de la ventana nueva"
        self.ui.setupUi(self.window)
        self.window.show()
    """
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(400, 600)                                                         #Mantengan este tamaño para las ventanas
        MainWindow.setAutoFillBackground(False)
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.Boton1 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1.setGeometry(QtCore.QRect(110, 250, 181, 51))
        self.Boton1.setObjectName("Boton1")
        
        self.Boton1.clicked.connect(self.show_popup)
        
        self.lineEdit_0 = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit_0.setGeometry(QtCore.QRect(100, 100, 211, 31))
        self.lineEdit_0.setObjectName("lineEdit_0")
        
        self.lineEdit = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit.setGeometry(QtCore.QRect(100, 160, 211, 31))
        self.lineEdit.setObjectName("lineEdit")
        self.lineEdit.setEchoMode(QtWidgets.QLineEdit.Password)
        
        self.label = QtWidgets.QLabel(self.centralwidget)
        self.label.setGeometry(QtCore.QRect(100, 80, 61, 16))
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(self.centralwidget)
        self.label_2.setGeometry(QtCore.QRect(100, 140, 71, 16))
        self.label_2.setObjectName("label_2")
        
        
        self.label_3 = QtWidgets.QPushButton(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(100, 200, 131, 25))
        self.label_3.setObjectName("label_3")
        
        self.label_3.clicked.connect(self.openRecupera)
        
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(110, 320, 181, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(self.openReg)
        
        #                                                                                   Background//usen esto para todas las ventanas adicionales
        self.label_4 = QtWidgets.QLabel(self.centralwidget)
        self.label_4.setGeometry(QtCore.QRect(0, 0, 456, 611))
        self.label_4.setAutoFillBackground(False)
        self.label_4.setText("")
        self.label_4.setPixmap(QtGui.QPixmap("ca3rs.jpg"))
        self.label_4.setScaledContents(True)
        self.label_4.setObjectName("label_4")
        self.label_4.raise_()
        
        
        
        
        #                                                                                   Trae los demas objetos al frente
        self.Boton1.raise_()
        self.lineEdit_0.raise_()
        self.lineEdit.raise_()
        self.label.raise_()
        self.label_2.raise_()
        self.label_3.raise_()
        self.Boton1_2.raise_()
        
        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtWidgets.QMenuBar(MainWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 400, 21))
        self.menubar.setObjectName("menubar")
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QtWidgets.QStatusBar(MainWindow)
        self.statusbar.setObjectName("statusbar")
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)
        
    #                                                                                       Se activa para probar datos
    def show_popup(self):
        
        msg = QMessageBox()
        usuario=self.lineEdit_0.text()
        password=self.lineEdit.text()
        if (usuario=="" or password==""):
            msg.setWindowTitle("Error")
            msg.setText("No puede dejar espacios en blanco!")
            
            #                                                                           Aqui revisen datos con usuario y password
            """
            #en caso de error
            elif (len(password)<6):
                msg.setWindowTitle("Error")
                msg.setText("No se puede dejar en blanco!")"""
            
        else:
            
            msg.setWindowTitle("Bienvenido!")
            msg.setText("Bienvenido al programa!")
            #                                                                           llamen para acceder a la ventana
        
        x = msg.exec_()
#                                                                                       Aqui revisen cara herramienta con su nombre
    def retranslateUi(self, MainWindow):
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "MainWindow"))
        self.Boton1.setText(_translate("MainWindow", "Acceder"))
        self.label.setText(_translate("MainWindow", "Usuario"))
        self.label_2.setText(_translate("MainWindow", "Constraseña"))
        self.label_3.setText(_translate("MainWindow", "¿Olvido su contraseña?"))
        self.Boton1_2.setText(_translate("MainWindow", "Registrarse"))


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(MainWindow)
    MainWindow.show()
    sys.exit(app.exec_())
