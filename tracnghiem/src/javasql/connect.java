/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 *
 */
public class connect {
    public Connection getConnection() throws SQLException {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conStr = "jdbc:mysql://localhost:3306/tracnghiem";
            conn = DriverManager.getConnection(conStr, "root", "");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        return conn;
    }
    
     
}