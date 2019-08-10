/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Store {
    private Product[] products;
    Scanner sc = new Scanner(System.in);
    int numbers = 0;
    public void addProduct(){
       
        Product p;
        //tao san pham
        System.out.println("Them Camera Hay SmartPhone (1/0)");
        int choice = sc.nextInt();
        if(choice==1){
            p = new Camera();
        }else{
            p = new SmartPhone();
        }
        p.addNew();
        //Co them dc hay khong;
        if(numbers >= products.length){
            System.out.println("Khong them duoc");
            return ;
        }
        products[numbers] = p;
        numbers++;
    }
    
    void listProduct(){
        System.out.println("=====Danh Sach=====");
        for(Product p: products){
            if(p == null)
                break;
            System.out.println(p);
        }
    }
    
    void search(String name){
        for(Product p : products){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("Khong tim thay");
    }
    
    public Store() {
        
    }

    public Store(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
}