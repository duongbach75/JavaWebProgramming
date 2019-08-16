/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class StudentModel {
    
    public List<Student> getStudents() throws ClassNotFoundException, SQLException {
        DBconnect db = new DBconnect();
        Connection conn = db.DBconnect();
        String sql = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getString("stt"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("khoa"));
            s.setDob(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    public int add(Student s) throws ClassNotFoundException, SQLException{
        DBconnect db= new DBconnect();
        Connection conn = db.DBconnect();
        String sql = "INSERT INTO `sinhvien`(`stt`, `name`, `khoa`, `lop`) VALUES (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,s.getId());
        pstmt.setString(2,s.getName());
        pstmt.setString(3, s.getMajor());
        pstmt.setString(4, s.getDob());
        return pstmt.executeUpdate();
    }
    public int update(Student s) throws ClassNotFoundException, SQLException{
        DBconnect db= new DBconnect();
        Connection conn = db.DBconnect();
        String sql = "UPDATE sinhvien SET name=?,  khoa=?, lop=? WHERE stt=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(2,s.getName());
        pstmt.setString(3, s.getMajor());
        pstmt.setString(4, s.getDob());
        return pstmt.executeUpdate();
    }
    public Student getstd(int stt) throws ClassNotFoundException, SQLException{
        Student s= new Student();
         DBconnect db= new DBconnect();
        Connection conn = db.DBconnect();
         String sql = "select * from sinhvien where stt='" + stt + "'";
          PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            s.setId(rs.getString("stt"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("khoa"));
            s.setDob(rs.getString("lop"));
        }
        return s;
    }
    public int delete(int stt) throws ClassNotFoundException, SQLException{
       Student s= new Student();
         DBconnect db= new DBconnect();
        Connection conn = db.DBconnect();
          PreparedStatement pstm = conn.prepareStatement("delete from sinhvien where stt=?");
          pstm.setInt(1, stt);
            return pstm.executeUpdate();
    }
}