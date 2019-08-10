/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUONG BACH
 */
public class CustomerManager {
    private ArrayList<Customer> c;

    public CustomerManager() {
        this.c= new ArrayList<>();
    }
    
    public void add(){
        Scanner input= new Scanner(System.in);
        Customer cus= new Customer();
        System.out.println("nhap id vào ban oi ");
        cus.setId(Integer.parseInt(input.nextLine()) );
        System.out.println("nhap ten vào di nào ");
        cus.setName(input.nextLine());
        System.out.println("nhap dia chi vào ");
        cus.setAddress(input.nextLine());
        System.out.println("nhap tuoi vào ban oi ");
        cus.setAge(Integer.parseInt(input.nextLine()));
        this.c.add(cus);
    }
    
    public boolean load(String file){
        try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
            List<Customer> cm= (List<Customer>)ois.readObject();
            this.c=(ArrayList<Customer>) cm;
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        return true;
    }
    
    public  Customer search(int id){
        for (Customer customer : c) {
            if(customer.getId()==id)
                
                return customer;
        }
        return null;
    }
    
    public  boolean save(){
        try {
            ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("file.txt"));
            os.writeObject(this.c);
            os.flush();
            os.close();
        
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        return true;
                
    }
}
