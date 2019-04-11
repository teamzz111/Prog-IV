
package Model;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conex {
    
    public Conex()
    {
    }
    
    public Connection getConection()
    {
    Connection link = null;
    String url = "jdbc:mysql://5.189.175.156:3306/simanca";
    try{
    Class.forName("com.mysql.jdbc.Driver");
    link = DriverManager.getConnection(url,"clases","Clases2018");
    }catch (SQLException err){
       JOptionPane.showMessageDialog(null, err.getMessage(),"Mensaje",0);
       
    }catch (Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage(),"Mensaje",0);
    }
   return link;
        
        
        }
}
