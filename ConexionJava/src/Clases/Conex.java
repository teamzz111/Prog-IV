package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conex {
    public Connection Conectarse()
    {
        Connection link=null;
        String url="jdbc:mysql://YOUR_DB_HOST:3306/YOUR_DB_NAME";
  
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
            link=DriverManager.getConnection(url, "YOUR_DB_USER", "YOUR_DB_PASSWORD");
        }
        catch(SQLException err){  
            JOptionPane.showMessageDialog(null, err.getMessage(), "Mensaje",0);
        }
        return link;
    }
}
