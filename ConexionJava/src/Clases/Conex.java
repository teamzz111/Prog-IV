package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conex {
    public Connection Conectarse()
    {
        Connection link=null;
        //String url="jdbc:mysql://5.189.175.156/dbcclasessimanca";
        String url = "jdbc:mysql://localhost/dbprog";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Driver no encontrado","Mensaje",0);
        }
        try 
        {
            link=DriverManager.getConnection(url, "root", "");
        }
        catch(SQLException err){  
            JOptionPane.showMessageDialog(null, err.getMessage(), "Mensaje",0);
        }
        return link;
    }
}
