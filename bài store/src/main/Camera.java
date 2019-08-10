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
public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
    }
    Scanner input= new Scanner(System.in);
    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    @Override
    void addNew(){
        super.addNew();
        System.out.println("camera có wifi không 1/0 ");
        int t= input.nextInt();
        if (t==1) hasWifi= true;
        else if (t==0) hasWifi= false;
    }
}
