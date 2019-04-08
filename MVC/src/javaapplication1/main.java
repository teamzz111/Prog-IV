/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import Controller.ControllerUsuarios;
import Model.UsuariosDAO;
import View.FrmInsertar;
/**
 *
 * @author AndresLargo
 */
public class main {

    public static void main(String[] args) {
        FrmInsertar vista = new FrmInsertar();
        UsuariosDAO modelo = new UsuariosDAO();
        ControllerUsuarios Controlador = new ControllerUsuarios(vista, modelo);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}
