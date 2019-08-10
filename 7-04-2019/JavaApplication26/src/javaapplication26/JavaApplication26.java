/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Student
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileUtils f= new FileUtils();
        System.out.println("1");
        f.layFolder("C:\\Users\\Student\\Desktop\\bt");
         System.out.println("2");
        f.layFile("C:\\Users\\Student\\Desktop\\bt");
         System.out.println("3");
        f.layanh("C:\\Users\\Student\\Desktop\\bt");
         System.out.println("4");
        f.laymorong("C:\\Users\\Student\\Desktop\\bt","txt");
         System.out.println("5");
        f.laythoigian("C:\\Users\\Student\\Desktop\\bt");
         System.out.println("6");
        f.laykichthuoc("C:\\Users\\Student\\Desktop\\g.txt","Mb");
    }
    
}
