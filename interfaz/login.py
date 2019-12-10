# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'login.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel, QApplication, QDialog

from registro import Ui_RegWindow
from recupera_cuenta import Ui_RecuperaWindow


class Ui_MainWindow(object):

    def openReg(self):
        self.window = QtWidgets.QMainWindow()
        self.ui = Ui_RegWindow()
        self.ui.setupUi(self.window)
        #MainWindow.hide()
        self.window.show()
        
    def openRecupera(self):
        self.window = QtWidgets.QMainWindow()
        self.ui = Ui_RecuperaWindow()
        self.ui.setupUi(self.window)
        #MainWindow.hide()
        self.window.show()
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(400, 600)
        MainWindow.setAutoFillBackground(False)
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.Boton1 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1.setGeometry(QtCore.QRect(110, 250, 181, 51))
        self.Boton1.setObjectName("Boton1")
        
        self.Boton1.clicked.connect(self.show_popup)
        
        self.textEdit = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit.setGeometry(QtCore.QRect(100, 100, 211, 31))
        self.textEdit.setObjectName("textEdit")
        self.textEdit_2 = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit_2.setGeometry(QtCore.QRect(100, 160, 211, 31))
        self.textEdit_2.setObjectName("textEdit_2")
        self.label = QtWidgets.QLabel(self.centralwidget)
        self.label.setGeometry(QtCore.QRect(100, 80, 61, 16))
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(self.centralwidget)
        self.label_2.setGeometry(QtCore.QRect(100, 140, 71, 16))
        self.label_2.setObjectName("label_2")
		
		
        self.label_3 = QtWidgets.QPushButton(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(100, 200, 131, 16))
        self.label_3.setObjectName("label_3")
        
        self.label_3.clicked.connect(self.openRecupera)
        
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(110, 320, 181, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(self.openReg)
        
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
        
    def show_popup(self):
        msg = QMessageBox()
        msg.setWindowTitle("Bienvenido!")
        msg.setText("Bienvenido al programa!")
        
        x = msg.exec_()

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
