/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author DUONG BACH
 */
public class elip {
    private int a;
    private int b;

    public elip() {
    }

    public elip(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    int dientich(int a, int b){
        int s;
        s= (int) (b*a*Math.PI);
        return s;
    }
}
