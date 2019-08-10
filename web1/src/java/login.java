/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import pk1.huamnmodel;
import pk1.human;

/**
 *
 * @author DUONG BACH
 */
@WebServlet(urlPatterns = {"/register"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        human h= new human();
        huamnmodel hm= new huamnmodel();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='1'>");
             out.println("<tr>");
             out.println("<td border='1'>");
             out.println("username");
             out.println(request.getParameter("name"));
             out.println("</td>");
             out.println("</tr>");
             
             
             out.println("<tr>");
             out.println("<td border='1'>");
             out.println("password");
             out.println(request.getParameter("pass"));
             out.println("</td>");
             out.println("</tr>");
             h.setPass(request.getParameter("pass"));
             
             out.println("<tr>");
             out.println("<td border='1'>");
             out.println("fullname");
             out.println(request.getParameter("fname"));
             out.println("</td>");
             out.println("</tr>");
             
             
             out.println("<tr border='1'>");
             out.println("<td>");
             out.println("email");
             out.println(request.getParameter("email"));
             out.println("</td>");
             out.println("</tr>");
            
             
             out.println("<tr>");
             out.println("<td border='1'>");
             out.println("address");
             out.println(request.getParameter("address"));
             out.println("</td>");
             out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
             h.setEmail(request.getParameter("email"));
            h.setFname(request.getParameter("fname"));
            h.setUser(request.getParameter("name"));
            h.setAddress(request.getParameter("address"));
            hm.SetHuman(h);
        }
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
