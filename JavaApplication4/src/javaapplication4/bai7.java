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
public class bai7 {
    public static void main(String[] args) {
        System.out.println("nhập n ");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int i;
        int[] a = new int[100];
        int[] b= new int[100];
        a[0]=1;
        a[1]=1;
        int j=0;
        for(i=2;i<=n;i++)
        {
           a[i]= input.nextInt(); 
        }
        for(i=2;i<=n;i++)
        {
            if ((a[i-1]+a[i-2])==a[i])
            {
                b[j]=b[j]+a[i];
                j++;
            } 
        }
        for(i=0;i<j;i++)
        {
            System.out.println(b[i]);
        }
    }
}
