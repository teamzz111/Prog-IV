package Controller;

import Model.Usuarios;
import Model.UsuariosDAO;
import View.FrmInsertar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class ControllerUsuarios implements ActionListener {
    
    FrmInsertar viewUsuarios = new FrmInsertar();
    UsuariosDAO modelUsers = new UsuariosDAO();
    Usuarios usuarios = new Usuarios();
    
    
    public ControllerUsuarios (FrmInsertar vistaUsuario, UsuariosDAO modelUsuarios){
        
        this.viewUsuarios = vistaUsuario;
        this.modelUsers = modelUsuarios;
        this.viewUsuarios.btnInsertar.addActionListener(this);
        this.viewUsuarios.btnConsultar.addActionListener(this);
        this.viewUsuarios.btnEliminar.addActionListener(this);
        this.viewUsuarios.btnActualizar.addActionListener(this);
              
        
    }
    
    public void InicializarCrud(){
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == viewUsuarios.btnInsertar){
            int documento = Integer.parseInt(viewUsuarios.txtDocumento.getText());
            String nombres = viewUsuarios.txtNombres.getText();
            String login = viewUsuarios.txtLogin.getText();
            String password = viewUsuarios.txtPassword.getText();
            String respuesta = modelUsers.newUsers(documento, nombres, login, password);
            if(respuesta != null){
                JOptionPane.showMessageDialog(viewUsuarios, "Ingreso Exitoso");
            }
        }
        
    
    
    if (e.getSource() == viewUsuarios.btnConsultar){
        String login = viewUsuarios.txtLogin.getText();
        modelUsers.listUsuarios(login);
        viewUsuarios.txtDocumento.setText(Integer.toString(modelUsers.listUsuarios(login).get(0).getDocumento()));
        viewUsuarios.txtNombres.setText(modelUsers.listUsuarios(login).get(0).getNombres());
        viewUsuarios.txtPassword.setText(modelUsers.listUsuarios(login).get(0).getPassword());
        JOptionPane.showMessageDialog(viewUsuarios, "Consulta realizada");
    }
    
    if(e.getSource() == viewUsuarios.btnEliminar){
        String login = viewUsuarios.txtLogin.getText();
        String rta = modelUsers.deleteUsuario(login);
        JOptionPane.showMessageDialog(viewUsuarios, "Datos eleminados");
    }
    
    if(e.getSource() == viewUsuarios.btnActualizar){
         int Documento = Integer.parseInt(viewUsuarios.txtDocumento.getText());
            String nombres = viewUsuarios.txtNombres.getText();
            String login = viewUsuarios.txtLogin.getText();
            String password = viewUsuarios.txtPassword.getText();
            String respuesta = modelUsers.Actualizaruser(Documento, nombres, login, password);
            if(respuesta != null){
                
                JOptionPane.showMessageDialog(viewUsuarios, "Datos actualizados");
            }
        
        
    }
    
    
    
    }
}
