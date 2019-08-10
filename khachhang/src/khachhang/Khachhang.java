/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class Khachhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CustomerManager cm= new CustomerManager();
       Scanner input= new Scanner(System.in);
       while(true){
           System.out.println("1.load");
           System.out.println("2.add");
           System.out.println("3. save");
           System.out.println("4.search");
           System.out.println("5.exit");
           System.out.println("moi ban chon ");
           int c= Integer.parseInt(input.nextLine());
           switch(c){
               case 1: 
                   System.out.println("nhap duong dan");
                   String path= input.nextLine();
                   cm.load(path);
                   break;
               case 2:
                   cm.add();
                   break;
               case 3:
                   cm.save();
                   break;
               case 4:
                   System.out.println("nhap id nào");
                   int s= Integer.parseInt(input.nextLine());
                   System.out.println(cm.search(s));
                   break;
               case 5:
                   System.exit(0);
                       }           
       }
       
    }
    
}
