package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dbconnect.Student;
import dbconnect.StudentModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUONG BACH
 */
@WebServlet(urlPatterns = "/control")
public class control extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("text/html;charset=UTF-8");
        StudentModel sm= new StudentModel();
        Student s= new Student();
        String command= request.getParameter("comand");
        
        switch(command){
            case "add":
            s.setId(request.getParameter("stt"));
                s.setName(request.getParameter("name"));
            s.setMajor(request.getParameter("khoa"));
            s.setDob(request.getParameter("lop"));
           {
               try {
                   sm.add(s);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(control.class.getName()).log(Level.SEVERE, null, ex);
               } catch (SQLException ex) {
                   Logger.getLogger(control.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
            response.sendRedirect("index.jsp");
              break;
            case "update":
                s.setName(request.getParameter("name"));
            s.setMajor(request.getParameter("khoa"));
            s.setDob(request.getParameter("lop"));
                sm.update(s);
                response.sendRedirect("index.jsp");
                break;
            case "delete":  
                sm.delete(Integer.parseInt(request.getParameter("id")));
                response.sendRedirect("index.jsp");
                break;
        }
          
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
