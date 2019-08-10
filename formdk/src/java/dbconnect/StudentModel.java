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
            s.setId(rs.getInt("stt"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("khoa"));
            s.setDob(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    
}