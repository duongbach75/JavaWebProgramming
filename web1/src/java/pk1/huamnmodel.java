/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DUONG BACH
 */
public class huamnmodel {
    public int SetHuman(human h) throws ClassNotFoundException, SQLException{
        dbconnect db= new dbconnect();
       Connection cnn= db.getConnection();
       String sql="INSERT INTO ngdk(user, password, fullname, email, address) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = cnn.prepareStatement(sql);
        pstmt.setString(1, h.getUser());
        pstmt.setString(2, h.getPass());
        pstmt.setString(3, h.getFname());
        pstmt.setString(4, h.getEmail());
        pstmt.setString(5, h.getAddress());
        return pstmt.executeUpdate();
    }
    public int GetHuman(String user, String pass) throws ClassNotFoundException, SQLException{
         dbconnect db= new dbconnect();
       Connection cnn= db.getConnection();
        String sql="SELECT * FROM `ngdk` WHERE user='?'AND password='?'";
        PreparedStatement pstmt = cnn.prepareStatement(sql);
        pstmt.setString(1, user);
        pstmt.setString(2, pass);
        ResultSet rs= pstmt.executeQuery();
        if(rs.next()) return 1; else return 0;
    }
}
