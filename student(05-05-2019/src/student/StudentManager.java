/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DUONG BACH
 */
public class StudentManager {
    private ArrayList<Student1> stm ;
    
    private int dem;

    public StudentManager() {
        this.stm=new ArrayList<>();
    this.dem=0;
    }
      Scanner input= new Scanner(System.in);
    public void add(){
        
        Student1 st=new Student1();
        System.out.println("nhap ten ");
        st.setName(input.nextLine());
        System.out.println("nhap rollnumber");
        st.setRollNumber(input.nextLine());
        System.out.println("nhap ngày sinh");
        st.setDate(Double.parseDouble(input.nextLine()));
        this.stm.add(st);        
    }
    
    public void search(){
        System.out.println("moi nhap ten de tim ");
        String nm= input.nextLine();
        for (Student1 std : stm) {
            if(nm== std.getName())
                System.out.println("ten hoc sinh can tim là "+std.getName());
                System.out.println("rollnumber hoc sinh can tim là "+std.getRollNumber());
                System.out.println("ngày sinh hoc sinh can tim là "+std.getDate());
        }
    }
    
    public void update(){
        
    }
    
    public void delete(){
         System.out.println("moi nhap ten de tim ");
        String nm= input.nextLine();
        for (Student1 std : stm) {
            if(nm== std.getName())
               this.stm.remove(std);
        }
    }
    
    public boolean load(){
        System.out.println("moi nhap duong dan");
        String file =input.nextLine();
         try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
            List<Student1> cm= (List<Student1>)ois.readObject();
            this.stm=(ArrayList<Student1>) cm;
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        return true;
    }
    
    public void read(){
        
    }
}
