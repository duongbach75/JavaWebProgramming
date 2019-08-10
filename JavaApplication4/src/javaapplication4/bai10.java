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
public class bai10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s= input.nextLine();
        int l=s.length();
        for (int i = 0; i < s.length()/2; i++)
        {
            if(s[l-i+1]==s[i])
            {
                System.out.println("sâu đối xứng");
            } 
            else System.out.println("sâu không đối xứng");
    }
    }
}
