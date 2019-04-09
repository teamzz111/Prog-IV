package Model;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class UsuariosDAO {
    
    
    Conex link = new Conex();
    


public UsuariosDAO(){

}

public String newUsers (int Documento,String Nombres, String Login, String Password){
    
    String sql = "INSERT INTO tbusuarios (Documento,Nombres,Login,Password)VALUES (" + Documento + ",'" + Nombres + "','" + Login + "','" + Password + "')";
    Connection con = link.getConection();
    try{
        con.createStatement().execute(sql);
    }catch (SQLException err){
        JOptionPane.showMessageDialog(null,err.getMessage(), "Error", 0);
        return "";
    }
    return "Registro Exitoso";
}

public ArrayList<Usuarios> listUsuarios(String Login){
    ArrayList listaUsuario = new ArrayList();
    Usuarios usuario = null;
    try{
        Connection con = link.getConection();
        String sql = "SELECT * FROM tbusuarios WHERE Login='" + Login + "';";
        ResultSet rs = con.createStatement().executeQuery(sql);
        while(rs.next()){
            
            usuario = new Usuarios();
            usuario.setDocumento(rs.getInt(1));
            usuario.setNombres(rs.getString(2));
            usuario.setLogin(rs.getString(3));
            usuario.setPassword(rs.getString(4));
            listaUsuario.add(usuario);
            
        }
        
        
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
    return listaUsuario; 
}

public String deleteUsuario (String Login){
    
    try{
        
        Connection con = link.getConection();
        String sql = "DELETE FROM tbusuarios WHERE Login='" + Login + "';";
        JOptionPane.showMessageDialog(null,sql);
        con.createStatement().execute(sql);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return "Registro Eliminado";
  
}


public String Actualizaruser (int Documento,String Nombres, String Login, String Password){
    
    try{
        
        Connection con = link.getConection();
        String sql = "UPDATE tbusuarios SET Nombres='" + Nombres + "',Documento='" + Documento + "',Password='" + Password +
                "' WHERE Login='" + Login + "';";
        con.createStatement().execute(sql);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
        return "Cambio Exitoso";
}




}

