/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Student
 */
public class Baitap {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("");
        StudentManager manager = new StudentManager();
        manager.add(new Student("Anh", "anh@act.com", 22));
        manager.add(new Student("Binh", "binh@act.com", 23));
        manager.add(new Student("Cuong", "cuong@act.com", 21));

        manager.list();
        System.out.println("------_TIM KIEM_---------");
        manager.search("Binh");

        System.out.println("------_SAP XEP_---------");
        System.out.println("TANG DAN");
        manager.list(true);
        System.out.println("Giam DAN");
        manager.list(false);
    }

}