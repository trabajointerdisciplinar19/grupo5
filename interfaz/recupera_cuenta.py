

#                                                                          Una miniguia de lo que es cada objeto esta retranslateUi
from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import QMessageBox, QLabel

class Ui_RecuperaWindow(object):
    def setupUi(self, RecuperaWindow):
        RecuperaWindow.setObjectName("RecuperaWindow")
        RecuperaWindow.resize(400, 600)
        self.centralwidget = QtWidgets.QWidget(RecuperaWindow)
        self.centralwidget.setObjectName("centralwidget")
        self.lineEdit = QtWidgets.QLineEdit(self.centralwidget)
        self.lineEdit.setGeometry(QtCore.QRect(80, 170, 211, 31))
        self.lineEdit.setObjectName("lineEdit")
        self.label_3 = QtWidgets.QLabel(self.centralwidget)
        self.label_3.setGeometry(QtCore.QRect(80, 190, 261, 81))
        self.label_3.setObjectName("label_3")
        self.label_5 = QtWidgets.QLabel(self.centralwidget)
        self.label_5.setGeometry(QtCore.QRect(80, 130, 131, 16))
        self.label_5.setObjectName("label_5")
        self.Boton1_2 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_2.setGeometry(QtCore.QRect(10, 10, 51, 51))
        self.Boton1_2.setObjectName("Boton1_2")
        
        self.Boton1_2.clicked.connect(lambda:self.closescr(RecuperaWindow))
        
        self.Boton1_3 = QtWidgets.QPushButton(self.centralwidget)
        self.Boton1_3.setGeometry(QtCore.QRect(90, 260, 181, 51))
        self.Boton1_3.setObjectName("Boton1_3")
        
        self.Boton1_3.clicked.connect(self.show_popup)
        
        
        
        #Background
        self.label_4 = QtWidgets.QLabel(self.centralwidget)
        self.label_4.setGeometry(QtCore.QRect(0, 0, 456, 611))
        self.label_4.setAutoFillBackground(False)
        self.label_4.setText("")
        self.label_4.setPixmap(QtGui.QPixmap("ca3rs.jpg"))
        self.label_4.setScaledContents(True)
        self.label_4.setObjectName("label_4")
        self.label_4.raise_()
        
        
        #Trae los demas objetos al frente
        self.lineEdit.raise_()
        self.label_5.raise_()
        self.label_3.raise_()
        self.Boton1_2.raise_()
        self.Boton1_3.raise_()
        
        
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
        
    def show_popup(self):
        correo = self.lineEdit.text()
        msg = QMessageBox()
        if (correo==""):                                         #no ingreso correo
            msg.setWindowTitle("Error")
            msg.setText("No puede dejar en blanco")
        elif (correo.find('@')<0):                               #no encuentra @ en cadena
            msg.setWindowTitle("Error")
            msg.setText("Ingrese un correo valido")
        else:                                                    #encuentra correo valido
            msg.setWindowTitle("Enviado!")
            msg.setText("Se le ha enviado un correo!")
        
        x = msg.exec_()

    def retranslateUi(self, RecuperaWindow):
        _translate = QtCore.QCoreApplication.translate
        RecuperaWindow.setWindowTitle(_translate("RecuperaWindow", "RecuperaWindow"))
        self.label_3.setText(_translate("RecuperaWindow", "En caso el correo esté registrado, se le mandará \n"
" un link para resetear su clave"))
        self.label_5.setText(_translate("RecuperaWindow", "Ingrese su correo:"))
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
