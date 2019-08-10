/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DUONG BACH
 */
public class thuchien {
    
    connect cn= new connect();
    Scanner input= new Scanner(System.in);
    
    
    public void c6() throws SQLException{
        System.out.println("nhap ten "); String ten= input.nextLine();
        System.out.println("nhap ngay"); String ngay= input.nextLine();
        Connection con= cn.getConnection();
        PreparedStatement ps = con.prepareStatement("select d.ten from PHIEUMUON p\n" +
"join SACH s on s.masach = p.masach \n" +
"join DOCGIA d on d.sothe = p.sothe\n" +
"where s.ten = "+ten+" and p.ngaymuon = "+ngay+"");
            ResultSet rs = ps.executeQuery();
            ps.setString(1, ten);
            ps.setString(2, ngay);
            while(rs.next()){
                System.out.println(rs.getString(ten));
            }
    }
    
    public void c7() throws SQLException{
         Connection con= cn.getConnection();
        PreparedStatement ps = con.prepareStatement("select d.sothe, d.ten, s.ten from PHIEUMUON p\n"+
"join SACH s on s.masach = p.masach\n "+
"join DOCGIA d on d.sothe = p.sothe\n "+
"where p.ngaymuon between '2019-01-01' and '2019-01-31'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("d.ten"));
                System.out.println(rs.getString("d.sothe"));
                System.out.println(rs.getString("s.masach"));
            }
    }
    
    public void c8() throws SQLException{
        Connection con= cn.getConnection();
        PreparedStatement ps= con.prepareStatement("select s.* from SACH s\n"+
            "where s.masach not in (select masach from PHIEUMUON)");
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("d.masach"));
        }
    }
    
    public void c9() throws SQLException{
        Connection con= cn.getConnection();
        PreparedStatement ps= con.prepareStatement("select count(*) as 'soluong' from PHIEUMUON p\n" +
"join DOCGIA d on d.sothe = p.sothe\n" +
"where d.ten = 'Anh'");
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("soluong"));
        }
    }
    
    public  void c10() throws SQLException{
        Connection con= cn.getConnection();
        PreparedStatement ps= con.prepareStatement("select d.* from PHIEUMUON p\n" +
"join DOCGIA d on d.sothe = p.sothe\n" +
"join DOCGIA d on d.ten \n" +
"where p.ngaytra is null");
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("d.sothe"));
            System.out.println(rs.getString("d.ten"));
        }
    }
}
