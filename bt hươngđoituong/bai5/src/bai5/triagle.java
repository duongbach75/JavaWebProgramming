/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.io.PrintStream;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class triagle {
    private int a;
    private int b;
    private int c;
Scanner input= new Scanner(System.in);
    public triagle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    triagle() {
       
    }

    

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    void inputInfo(){
        System.out.println("nhập số a vào: ");
        a= input.nextInt();
        System.out.println("nhập số b: ");
        b= input.nextInt();
        System.out.println("nhập số c ");
        c= input.nextInt();
    }
    void kieu(){
         if ((this.a + this.b > this.c) || (this.a + this.c > this.b) || (this.b + this.c > this.a)) 
			System.out.println("Đây là tam giác !");
        else
            if ((this.a==this.b)&&(this.b==this.c)) System.out.println("tam giác đều");
        else 
            if ((this.a==this.b)&&(this.a==this.c)) System.out.println("tam giác cân");
        else
            if ((this.a * this.a == this.b * this.b + this.c * this.c) || (this.b * this.b == this.a * this.a + this.c * this.c) || (this.c * this.c == this.b * this.b + this.a * this.a)) 
			System.out.println("Đây là tam giác vuông !"); 
    }
    int dientich(){
 int p=(this.a+this.b+this.c)/2;
 double d=Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    return (int) d;
    }
    int chuvi(){
        int p=this.a+this.b+this.c;
        return p;
    }
    void printInfo(){
        System.out.println("diện tích là"+this.dientich());
        System.out.println("chu vi là "+ this.chuvi());
    }
}
