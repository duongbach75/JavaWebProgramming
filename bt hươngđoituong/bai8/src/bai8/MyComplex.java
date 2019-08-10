/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
public class sophuc {
    private int thuc;
    private int ao;
   Scanner input= new Scanner(System.in);

    public sophuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

   

    public int getThuc() {
        return thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }
    void inputInfo(){
        System.out.println("nhập vào thực ");
        this.thuc= input.nextInt();
        System.out.println("nhập vào ảo ");
        this.ao= input.nextInt();
    }
    public sophuc congSP(sophuc A, sophuc B)
{
sophuc C=new sophuc();
C.thuc=A.thuc + B.ao;
C.ao=A.thuc + B.ao;
return C;
}
public sophuc tichSP(sophuc A, sophuc B)
{
sophuc C=new sophuc();
C.thuc=A.thuc*B.thuc - A.ao*B.ao;
C.ao=A.thuc*B.ao + A.ao*B.thuc;
return C;
}
}
