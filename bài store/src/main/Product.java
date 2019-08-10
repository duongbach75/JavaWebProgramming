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
public class Product {
    private int id;
    private String name;
        private double price;

        private int quantity;

        Scanner input= new Scanner(System.in);

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    void addNew(){
        System.out.println("nhập vào ID: ");
        this.id= Integer.parseInt(input.nextLine());
        System.out.println("nhập vào tên sản phẩm: ");
        this.name= input.nextLine();
        System.out.println("nhập vào giá: ");
        this.price= Float.parseFloat(input.nextLine());
        System.out.println("nhập vào số lượng: ");
        this.quantity= Integer.parseInt(input.nextLine());
    }

}
