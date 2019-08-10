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
public class bai5 {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.println("nhập số n vào");
     System.out.println("nhap x");
      int n= input.nextInt();
      int x= input.nextInt();
     int s=1; 
      for (int i=2;i<=n;i++)  s=s+1/i;
     int s2=0;
      for ( int j=1;j<=n;j++)  s2=s2+j;
     int s3=0;
      for (int k=1;k<=n;k++)  s3=s3+k*k;
     int s4=0;
      for (int l=1;l<=n;l++)  s4=s4+2*l;
     int s5=0;
      for (int l=1;l<=n;l++)  s5=s5+1/(2*l+1);
     int s6=0;
      for (int l=1;l<=n;l++)  s4=s4+1/(l*(l+1));
     int s7=0;
      for (int l=1;l<=n;l++)  s4=s4+(2*l+1)/(2*l+2); 
      System.out.println(s);
       System.out.println(s2);
         System.out.println(s3);
           System.out.println(s4);
             System.out.println(s5);
               System.out.println(s6);
                 System.out.println(s7);
                 int a = 1;
                 int s8=0;
     for (int i=1;i<n;i++)
     {
         for (int j=1;j<i;j++)
         {
             a=a*j;
         }
         s8=s8+a;
     }
     int s9=0;
     int k=1;
    for (int i=1;i<n;i++)
     {
         for (int j=1;j<i;j++)
         {
             k=k*x;
         }
         s9=s9+k;
     }
    int s10=0;
     int u=1;
    for (int i=1;i<n;i++)
     {
         for (int j=1;j<2*i;j++)
         {
             u=u*x;
         }
         s10=s10+u;
     }
    int s11=0;
     int z=1;
    for (int i=1;i<n;i++)
     {
         for (int j=1;j<(2*i+1);j++)
         {
             z=z*x;
         }
         s11=s11+z;
     }
    int s12=0;
     int f=0;
    for (int i=1;i<n;i++)
     {
         for (int j=1;j<i;j++)
         {
             f=f+j;
         }
         s12=s12+1/f;
     }
    System.out.println(s8);
    System.out.println(s9);
    System.out.println(s10);
    System.out.println(s11);
    System.out.println(s12);
}
}    
