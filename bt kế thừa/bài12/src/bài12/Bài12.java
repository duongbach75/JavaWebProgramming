/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài12;

/**
 *
 * @author DUONG BACH
 */
public class Bài12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        polygon p= new polygon();
        p.chuvi(5,6);    
        System.out.println(p.chuvi(5, 6));
        parallelogram a= new parallelogram();
        a.chuvi(5,6);
        a.hbh(6,5);
        System.out.println(a.chuvi(5, 6)+"   "+ a.hbh(6,5));
        rectangle c=  new rectangle();
       
        System.out.println(c.chuvi(5, 6)+"   "+ c.hbh(5,6));
                
        
    }
}
