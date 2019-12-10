# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'recupera_cuenta.ui'
#
# Created by: PyQt5 UI code generator 5.13.2
#
# WARNING! All changes made in this file will be lost!


from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel

class Ui_RecuperaWindow(object):
    def setupUi(self, RecuperaWindow):
        RecuperaWindow.setObjectName("RecuperaWindow")
        RecuperaWindow.resize(400, 600)
        self.centralwidget = QtWidgets.QWidget(RecuperaWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.textEdit = QtWidgets.QTextEdit(self.centralwidget)
        self.textEdit.setGeometry(QtCore.QRect(80, 170, 211, 31))
        self.textEdit.setObjectName("textEdit")
        self.label_3 = QtWidgets.QLabel(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(80, 190, 261, 81))
        self.label_3.setObjectName("label_3")
        self.label_4 = QtWidgets.QLabel(self.centralwidget)
        self.label_4.setGeometry(QtCore.QRect(80, 130, 131, 16))
        self.label_4.setObjectName("label_4")
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(10, 10, 51, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(lambda:self.closescr(RecuperaWindow))
        
        self.Boton1_3 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_3.setGeometry(QtCore.QRect(90, 260, 181, 51))
        self.Boton1_3.setObjectName("Boton1_3")
        RecuperaWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtWidgets.QMenuBar(RecuperaWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 400, 21))
        self.menubar.setObjectName("menubar")
        RecuperaWindow.setMenuBar(self.menubar)
        self.statusbar = QtWidgets.QStatusBar(RecuperaWindow)
        self.statusbar.setObjectName("statusbar")
        RecuperaWindow.setStatusBar(self.statusbar)

        self.retranslateUi(RecuperaWindow)
        QtCore.QMetaObject.connectSlotsByName(RecuperaWindow)
        
        
    def closescr(self,RecuperaWindow):
        RecuperaWindow.hide()

    def retranslateUi(self, RecuperaWindow):
        _translate = QtCore.QCoreApplication.translate
        RecuperaWindow.setWindowTitle(_translate("RecuperaWindow", "RecuperaWindow"))
        self.label_3.setText(_translate("RecuperaWindow", "En caso el correo esté registrado, se le mandará \n"
" un link para resetear su clave"))
        self.label_4.setText(_translate("RecuperaWindow", "Ingrese su correo:"))
        self.Boton1_2.setText(_translate("RecuperaWindow", "<-"))
        self.Boton1_3.setText(_translate("RecuperaWindow", "Enviar"))


if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    RecuperaWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(RecuperaWindow)
    RecuperaWindow.show()
    sys.exit(app.exec_())
