/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class student {
    private String msv;
    private int diemtb;
    private int tuoi;
    private String lop;
    Scanner input= new Scanner(System.in);
public student(){

}

    public student(String msv, int diemtb, int tuoi, String lop) {
        this.msv = msv;
        this.diemtb = diemtb;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    public String getmsv(){
        return msv;
    }
    public void setmsv(String msv){
        this.msv=msv;
    }
     public int getdiemtb(){
        return diemtb;
    }
    public void diemtb(int diemtb){
        this.diemtb=diemtb;
    }
     public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
     public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    void inputInfo(){
        System.out.println("nhập mã sinh viên ");
        msv= input.nextLine();
        System.out.println("nhập điểm trung bình ");
        diemtb= input.nextInt();
        System.out.println("nhập tuôi ");
        tuoi=input.nextInt();
        input.nextLine();
        System.out.println("nhập lớp ");
        lop=input.nextLine();
    }
    void showInfo(){
        System.out.println("mã sinh viên là "+this.msv);
        System.out.println("điểm trung bình là "+this.diemtb);
        System.out.println("tuôi của sinh viên "+this.tuoi);
        System.out.println("lớp của sinh viên là "+this.lop);
    }
    void hocbong(){
        if (this.diemtb>8) System.out.println("co hoc bổng nhé baby");
        else System.out.println("ngồi đó mà mơ");
    }
            
}

