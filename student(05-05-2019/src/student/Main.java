/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         StudentManager cm= new StudentManager();
       Scanner input= new Scanner(System.in);
       while(true){
           System.out.println("1.add");
           System.out.println("2.search");
           System.out.println("3. update");
           System.out.println("4.delete");
           System.out.println("5.luu vao file");
           System.out.println("6.doc trong file");
           System.out.println("7. exit");
           System.out.println("moi ban chon ");
           int c= Integer.parseInt(input.nextLine());
           switch(c){
               case 1: 
                   cm.add();
                   break;
               case 2:
                   cm.search();
                   break;
               case 3:
                   cm.update() ;
                   break;
               case 4:
                   cm.delete();
                   break;
               case 5:
                   cm.load();
                   break;
               case 6:
                   cm.read();
                   break;
               case 7:
                   System.exit(0);
                       }           
       }
  
    
}
}