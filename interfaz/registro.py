# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'untitled.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!

#Una miniguia de lo que es cada objeto esta retranslateUi






from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel, QApplication, QDialog


class Ui_RegWindow(object):
    def setupUi(self, RegWindow):
        RegWindow.setObjectName("RegWindow")
        RegWindow.resize(400, 600)
        self.centralwidget = QtWidgets.QWidget(RegWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.lineEdit_0 = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit_0.setGeometry(QtCore.QRect(100, 90, 211, 31))
        self.lineEdit_0.setObjectName("lineEdit_0")
        
        
        self.lineEdit = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit.setGeometry(QtCore.QRect(100, 160, 211, 31))
        self.lineEdit.setObjectName("lineEdit")
        self.lineEdit.setEchoMode(QtWidgets.QLineEdit.Password)
        
        
        self.lineEdit_2 = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit_2.setGeometry(QtCore.QRect(100, 230, 211, 31))
        self.lineEdit_2.setObjectName("lineEdit_2")
        self.lineEdit_2.setEchoMode(QtWidgets.QLineEdit.Password)
        
        
        self.label = QtWidgets.QLabel(self.centralwidget)
        self.label.setGeometry(QtCore.QRect(100, 50, 131, 31))
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(self.centralwidget)
        self.label_2.setGeometry(QtCore.QRect(100, 130, 131, 31))
        self.label_2.setObjectName("label_2")
        self.label_3 = QtWidgets.QLabel(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(100, 200, 131, 31))
        self.label_3.setObjectName("label_3")
        

        #                                                                                                   boton para registrarse
        self.Boton1 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1.setGeometry(QtCore.QRect(110, 290, 181, 51))
        self.Boton1.setObjectName("Boton1")
        
        self.Boton1.clicked.connect(self.registrame)
        
        
        
        
        
        
        
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(10, 10, 51, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(lambda:self.closescr(RegWindow))#                                     
        
        
        #                                                                                                   Background
        self.label_4 = QtWidgets.QLabel(self.centralwidget)
        self.label_4.setGeometry(QtCore.QRect(0, 0, 456, 611))
        self.label_4.setAutoFillBackground(False)
        self.label_4.setText("")
        self.label_4.setPixmap(QtGui.QPixmap("ca3rs.jpg"))
        self.label_4.setScaledContents(True)
        self.label_4.setObjectName("label_4")
        self.label_4.raise_()
        
        
        #                                                                                                   Trae los demas objetos al frente
        self.Boton1.raise_()
        self.lineEdit_0.raise_()
        self.lineEdit.raise_()
        self.label.raise_()
        self.label_2.raise_()
        self.label_3.raise_()
        self.Boton1_2.raise_()
        self.lineEdit_2.raise_()
        
        
        RegWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtWidgets.QMenuBar(RegWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 400, 21))
        self.menubar.setObjectName("menubar")
        RegWindow.setMenuBar(self.menubar)
        self.statusbar = QtWidgets.QStatusBar(RegWindow)
        self.statusbar.setObjectName("statusbar")
        RegWindow.setStatusBar(self.statusbar)

        self.retranslateUi(RegWindow)
        QtCore.QMetaObject.connectSlotsByName(RegWindow)
        
    
        
        
    #                                                                                                       Funcion para registrarse
    def registrame(self,RegWindow):
        pass1 = self.lineEdit.text()
        pass2 = self.lineEdit_2.text()
        username = self.lineEdit_0.text()
        msg = QMessageBox()
        if (len(pass1)<6 or len(pass2)<6):
            msg.setWindowTitle("Error!")
            msg.setText("La contraseña es muy corta!(6 caracteres minimo)")
            x=msg.exec_()
        elif (pass1=="" or pass2=="" or username==""):
            msg.setWindowTitle("Error!")
            msg.setText("No puede dejar espacios en blanco!")
            x=msg.exec_()
        else:
            if pass1!=pass2:
                msg.setWindowTitle("Error!")
                msg.setText("Contraseñas no coinciden!")
                x = msg.exec_()
            else:
                msg.setWindowTitle("Saludo!")
                msg.setText("Gracias por Registrarse!")
                x = msg.exec_()
        
        
        
        
        #                                                                                   Usen username y pass para añadirlo a tabla usuarios
            
            
    def closescr(self,RegWindow):
        RegWindow.hide()

    def retranslateUi(self, RegWindow):
        _translate = QtCore.QCoreApplication.translate
        RegWindow.setWindowTitle(_translate("RegWindow", "RegWindow"))
        self.label.setText(_translate("RegWindow", "Usuario"))
        self.label_2.setText(_translate("RegWindow", "Contraseña"))
        self.label_3.setText(_translate("RegWindow", "Repita contraseña"))
        self.Boton1.setText(_translate("RegWindow", "Registrar"))
        self.Boton1_2.setText(_translate("RegWindow", "<-"))


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    RegWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(RegWindow)
    RegWindow.show()
    sys.exit(app.exec_())
