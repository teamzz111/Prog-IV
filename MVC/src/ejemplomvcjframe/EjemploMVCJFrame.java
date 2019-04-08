package ejemplomvcjframe;

import Controller.ControllerUsuarios;
import Model.UsuariosDAO;
import View.FrmInsertar;

public class EjemploMVCJFrame {

    public static void main(String[] args) {
        
        FrmInsertar vista = new FrmInsertar();
        UsuariosDAO modelo = new UsuariosDAO();
        ControllerUsuarios Controlador = new ControllerUsuarios(vista,modelo);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }
    
}
