/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracnghiem;

import java.sql.SQLException;
import javasql.thuchien;

/**
 *
 * @author DUONG BACH
 */
public class Tracnghiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        thuchien th= new thuchien();
        th.dangnhap();
        th.traloi();
    }
    
}
