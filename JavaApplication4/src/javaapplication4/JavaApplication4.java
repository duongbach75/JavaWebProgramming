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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("nhhap a b c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int d= b*b-4*a*c;
        if (d>0)
            System.out.println("x1= "+ (-b+sqrt(d))/(2*a)+" x2= "+ (-b-sqrt(d))/(2*a) );
        else
            if (d==0)
                 System.out.println("nghiem kép x= "+ -b/(2*a));
            else 
                 System.out.println("vô nghiệm");
        
    }
    
}
