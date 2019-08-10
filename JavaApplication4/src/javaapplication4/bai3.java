/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class bai3 {
    public static void main(String[] args) {
        System.out.println("nhap số n ");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int t=0;
        int b=0;
        boolean ktnt;
        while (n > t)
        {
            if (t < 2)
            {
             ktnt = false;
            }       
     
    for (int i = 2; i < sqrt(t); i++){
        if (t % i == 0){
            ktnt = false;
        }   
       if (ktnt= true) 
       {
           b= b+i;
       }
    }
     if (ktnt= true)
         
    ktnt= true;
        }
        t++;   
        System.out.println("kết qua "+ b );
    }
  
}
