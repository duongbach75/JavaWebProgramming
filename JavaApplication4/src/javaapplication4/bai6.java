/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class bai6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("nhap số a");
        int a= input.nextInt();
        System.out.println("nhap số b");
        int b= input.nextInt();
        int a1=a;
        int b1=b;
        while (a!=b)
        {
            if (a>b) a=a-b;
            else b=b-a;
        }
        System.out.println("USCLN "+a);
        System.out.println("BSCNN "+a1*b1/a);
    }
 
}
