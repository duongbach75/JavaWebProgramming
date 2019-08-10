/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author DUONG BACH
 */
public class SoNguyenTo {
    
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x) {
       if(isSoNguyenTo(x)){
           this.a=x;
       }
       else
            System.out.println("x khong phai la so nguyen to , khong luu tru ");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
         if(isSoNguyenTo(a)){
           this.a=a;
            // System.out.println("aâ");
       }
       else
            System.out.println("x khong set ");
    }
    
    
    
    public boolean isSoNguyenTo(int x){
        if(x<=1)
        {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;
        
    }
    public  int timsoNguyenToTiepTheo(int x){
        int dem = 0;
        int i = x+1;
        while(dem<1){
            if(isSoNguyenTo(i)){
                System.out.printf("so nguyen to tiep theo la : %d",i);
                dem++;
            }
            i++;
        }
        return 0;
    }   
    }

