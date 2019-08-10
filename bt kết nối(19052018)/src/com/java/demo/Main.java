/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;


import java.sql.SQLException;

import java.util.Scanner;

import javasql.thuchien;

/**
 *
 * @author pc
 */
public class Main {

   
    public static void main(String[] args) throws SQLException {
        thuchien th= new thuchien();
        int c=0;
        Scanner input= new Scanner(System.in)
                ;
        while (true) {            
            System.out.println("câu 6");
            System.out.println("câu 7");
            System.out.println("câu 8");
            System.out.println("câu 9");
            System.out.println("câu 10");
            System.out.println("moi chon ");
         c= Integer.parseInt(input.nextLine());
         switch(c){
             case 6:
                 th.c6();
                 break;
                 
             case 7:
                 th.c7();
                 break;
             case 8:
                 th.c8();
                 break;
             case 9:
                 th.c9();
                 break;
             case 10:
                 th.c10();
                 break;
             case 0:
                 System.exit(0);
         }
        }
    }
}