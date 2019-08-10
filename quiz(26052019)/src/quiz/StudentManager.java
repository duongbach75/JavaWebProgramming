/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class StudentManager {
    connect cn= new connect();
    Scanner input= new Scanner(System.in);
     public Student dangnhap(String email, String pass) throws SQLException, ClassNotFoundException{
        Connection con= cn.getConnect();
        PreparedStatement ps = con.prepareStatement("SELECT* FROM `student` WHERE email=? and pass=?");
       ps.setString(1, email);
       ps.setString(2, pass);
       Student s=null;
       ResultSet rs= ps.executeQuery();
        if (rs.next()) s=new Student(rs.getInt("Id"), rs.getString("name"), rs.getString("email"), rs.getString("pass"));
      return s;
    }
     public int addAnswer(Student s,Question q, String answer) throws SQLException, ClassNotFoundException{
         Connection con= cn.getConnect();
         PreparedStatement ps= con.prepareStatement("INSERT INTO student_questions VALUES (?,?,?)");
         ps.setInt(1, s.getId());
         ps.setInt(2, q.getId());
         ps.setString(3, answer);
         return ps.executeUpdate();
     }
     public void printResult( Student s) throws SQLException, ClassNotFoundException {
         Connection con= cn.getConnect();
         PreparedStatement ps= con.prepareStatement("select sq.correct as student_answer, q.* from student_questions as sq "
                + "join questions as q on q.`id` = sq.`question_id` "
                + "where sq.`student_id` = ?");
         ps.setInt(1, s.getId());
         QuestionManager qm= new QuestionManager();
         List<Question> q= qm.getQuestion();
         ResultSet rs= ps.executeQuery();
         int count=1;
         
         while (rs.next()) {
             String kq= rs.getString("correct").toLowerCase().equals(rs.getString("student_answer").toLowerCase()) ?"true":"false"
                     ;
              System.out.printf("Question %d/%d - %s\n", count++, q.size() ,kq);
           if (rs.getString("correct").equals("a"))
                System.out.println("[A]. " + rs.getString("answer_a"));
            else 
                System.out.println("A. " + rs.getString("answer_a"));
            
            if (rs.getString("correct").equals("b"))
                System.out.println("[B]. " + rs.getString("answer_b"));
            else 
                System.out.println("B. " + rs.getString("answer_b"));
            
            if (rs.getString("correct").equals("c"))
                System.out.println("[C]. " + rs.getString("answer_c"));
            else 
                System.out.println("C. " + rs.getString("answer_c"));
            
            if (rs.getString("correct").equals("d"))
                System.out.println("[D]. " + rs.getString("answer_d"));
            else 
                System.out.println("D. " + rs.getString("answer_d"));
            
             
         }
     }
}
