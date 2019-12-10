# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'untitled.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel


class Ui_RegWindow(object):
    def setupUi(self, RegWindow):
        RegWindow.setObjectName("RegWindow")
        RegWindow.resize(400, 600)
        self.centralwidget = QtWidgets.QWidget(RegWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.textEdit = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit.setGeometry(QtCore.QRect(100, 90, 211, 31))
        self.textEdit.setObjectName("textEdit")
        self.textEdit_2 = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit_2.setGeometry(QtCore.QRect(100, 160, 211, 31))
        self.textEdit_2.setObjectName("textEdit_2")
        self.textEdit_3 = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit_3.setGeometry(QtCore.QRect(100, 230, 211, 31))
        self.textEdit_3.setObjectName("textEdit_3")
        self.label = QtWidgets.QLabel(self.centralwidget)
        self.label.setGeometry(QtCore.QRect(100, 50, 131, 31))
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(self.centralwidget)
        self.label_2.setGeometry(QtCore.QRect(100, 130, 131, 31))
        self.label_2.setObjectName("label_2")
        self.label_3 = QtWidgets.QLabel(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(100, 200, 131, 31))
        self.label_3.setObjectName("label_3")
        self.Boton1 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1.setGeometry(QtCore.QRect(110, 290, 181, 51))
        self.Boton1.setObjectName("Boton1")
        
        self.Boton1.clicked.connect(lambda:self.closescr(RegWindow))
        
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(10, 10, 51, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(lambda:self.closescr(RegWindow))
        
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
