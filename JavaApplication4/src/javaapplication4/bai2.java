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
public class bai2 {
    
    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
         System.out.println("nhập số n ");
         Scanner input = new Scanner("System.in");
         int n= input.nextInt();
         int t=1;
         for (int i=0;i<=n;i++)
         {
             t = t*i;
         }
         System.out.println("giai thừa của n= " + t);
     }
}
