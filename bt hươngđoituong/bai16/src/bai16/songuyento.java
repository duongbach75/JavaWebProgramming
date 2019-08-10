/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

/**
 *
 * @author DUONG BACH
 */
public class songuyento {
   private int a;
 boolean isPrimeNumber(int n) {
        
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public songuyento() {
    }

    public songuyento(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isPrimeNumber(this.a)== true)
        this.a= a;
        else 
           this.a=0;
    }
   int snt(){
       int snt = this.a+1;
       if (isPrimeNumber(this.a)== true)
           while (isPrimeNumber(snt)== false )
           {
               if (isPrimeNumber(snt)== true) break;
               else snt++;
           } 
       return snt;
   }
}
