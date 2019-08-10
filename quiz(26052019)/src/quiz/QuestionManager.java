/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class QuestionManager {
    connect cn= new connect();
    Scanner input= new Scanner(System.in);
    
    public List<Question> getQuestion()throws ClassNotFoundException, SQLException{
        Connection con= cn.getConnect();
        PreparedStatement ps= con.prepareStatement("SELECT * FROM `question` WHERE 1");
    List<Question> li= new ArrayList<>();
    ResultSet rs= ps.executeQuery();
        while (rs.next()) {
            Question q= new Question();
            q.setId(rs.getInt("id"));
            q.setAnswer_a(rs.getString("answer_a"));
            q.setAnswer_b(rs.getString("answer_b"));
            q.setAnswer_c(rs.getString("answer_c"));
            q.setAnswer_d(rs.getString("answer_d"));
//            q.setCorrect(rs.getString("correct"));
            li.add(q); 
        }
        return li;
    }
}
