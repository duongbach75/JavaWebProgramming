/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class triagle {
    private int dai;
    private int rong;
Scanner input= new Scanner(System.in);
   public triagle() {
    }
   
public triagle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }   
    public int getDai() {
        return dai;
    }
     public void setDai(int dai) {
        this.dai = dai;
    }


    public int getRong() {
        return rong;
    }

   
    public void setRong(int rong) {
        this.rong = rong;
    }
    void inputInfo(){
        System.out.println("nhập 3 cạnh của tam giác vào đi ");
        this.dai=input.nextInt();
        this.rong=input.nextInt();
    }
    void dientich(){
        System.out.println("diện tích tam giác là "+ this.dai*this.rong);
    }
    void chuvi(){
        System.out.println("chi vi tam giác là "+(this.dai+this.rong)*2);
    }
}
