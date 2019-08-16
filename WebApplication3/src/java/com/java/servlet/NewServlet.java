/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servlet;

import com.java.model.News;
import com.java.model.NewsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUONG BACH
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/News"})
public class NewServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            NewsModel n = new NewsModel();
            int cout = n.countNews();
            int currpage = 1;
            int numbernews = 2;
            int numberpage = (int) Math.floor(cout / numbernews) + 1;
            request.setAttribute("total", numberpage);
            currpage = Integer.parseInt(request.getParameter("page"));
            List<News> news = n.getNews(numbernews, numbernews * (currpage - 1));
            request.setAttribute("News", news);

            String name = request.getParameter("search");
            List<News> ne = n.getNews(0, cout);
            for (News news1 : ne) {

                if (name.equals(news1.getTitle())) {
                    out.println("<div class=\"card-body\">\n");
                    out.println("<h5 class=\"card-title\">" + news1.getTitle() + "</h5>\n");
                    out.println("<p class=\"card-text\">" + news1.getSummary() + "</p>\n");
                    out.println("<p>Đăng bởi:" + news1.getAuthor() + "</p>\n");
                    out.println("</div>");
                }
            }

            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
