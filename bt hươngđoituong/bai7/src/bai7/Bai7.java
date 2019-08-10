/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author DUONG BACH
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
 {
  PhanSo ps=new PhanSo(16,4);
  PhanSo ps2=new PhanSo(4,8);
  System.out.println("Phan so: " + ps.tu + "/" + ps.mau);
  System.out.println("USCLN: " + ps.USCLN(ps.tu,ps.mau));
  //ps.rutGon();
  //System.out.println("Phan so: " + ps.tu + "/" + ps.mau);
  ps.congPS(ps2);
  ps.truPS(ps2);
  ps.nhanPS(ps2);
  ps.chiaPS(ps2);
 }
    }
    

