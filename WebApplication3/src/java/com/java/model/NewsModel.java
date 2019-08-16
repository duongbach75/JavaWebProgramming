/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DUONG BACH
 */
public class NewsModel {
    public List<News> getNews(int limit, int offset) throws ClassNotFoundException, SQLException{
        
        DBConnector db= new DBConnector();
        Connection con= db.getConnection();
        PreparedStatement pstmt= con.prepareStatement("SELECT * FROM news LIMIT ? OFFSET ?");
        pstmt.setInt(1, limit);
        pstmt.setInt(2, offset);
        List<News> list= new ArrayList<News>();
        ResultSet rs= pstmt.executeQuery();
        while(rs.next()){
              list.add(new News(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getInt("author_id"), rs.getString("summary")));
        }
        return list;
    }
    public int countNews() throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM news");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    
}
