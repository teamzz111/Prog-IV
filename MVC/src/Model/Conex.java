/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresLargo
 */
public class Conex {

    public Connection getConection() {
        Connection link = null;
        String url = "jdbc:mysql://5.189.175.156:3306/simanca";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            link = DriverManager.getConnection(url, "fsimanca", "");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Mensaje", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje", 0);
        }
        return link;
    }

}
