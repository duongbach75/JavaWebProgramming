
package javasql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 *
 * @author DUONG BACH
 */
public class thuchien {
    connect cn= new connect();
    Scanner input= new Scanner(System.in);
    
    public boolean dangnhap() throws SQLException{
        Connection con= cn.getConnection();
        System.out.println("nhap email ");
        System.out.println("nhap mat khau ");
        String email=input.nextLine();
        String pass=input.nextLine();
        
       PreparedStatement ps = con.prepareStatement("SELECT* FROM `student` WHERE email=? and pass=?");
       ps.setString(1, email);
       ps.setString(2, pass);
       ResultSet rs= ps.executeQuery();
        if (rs.next()) {System.out.println("dang nhap thanh cong");
        return true;
        }
        
        else {System.out.println("dang nhap that bai");
        return false;
        }
    }
    
    public void traloi() throws SQLException{
        if(dangnhap()==true){
            Connection con= cn.getConnection();
            PreparedStatement ps= con.prepareStatement("SELECT `CONTENT`, `answer_a`, `answer_b`, `answer_c`, `answer_d` FROM `queston` WHERE 1");
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString("content"));
                System.out.println(rs.getString("answer_a"));
                System.out.println(rs.getString("answer_b"));
                System.out.println(rs.getString("answer_c"));
                System.out.println(rs.getString("answer_d"));
            }
        }
    }
}
