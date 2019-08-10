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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    Scanner input= new Scanner(System.in);
    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }
    @Override
    void addNew(){
        super.addNew();
        System.out.println("có camera k? 1/0 ");
        int t= input.nextInt();
        if (t==1) hasCamera= true;
        else if (t==0) hasCamera= false;
        System.out.println("nhập số sim ");
        this.sim=input.nextInt();
    }
    
}
