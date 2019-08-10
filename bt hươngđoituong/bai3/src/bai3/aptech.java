/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class aptech {
    private String hdse;
    private int diem;
    private String noiquy;
    private int lanthi;
    Scanner input= new Scanner(System.in);
public aptech(){
    
}  

    public aptech(String hdse, int diem, String noiquy, int lanthi) {
        this.hdse = hdse;
        this.diem = diem;
        this.noiquy = noiquy;
        this.lanthi = lanthi;
    }
    public String gethdse(){
        return hdse;
    }
    public void sethdse(String hdse){
        this.hdse=hdse;
    }
    public int getdiem(){
        return diem;
    }
    public void setdiem(int diem){
        this.diem=diem;
    }
    public String getnoiquy(){
        return noiquy;
    }
    public void setnoiquy(String noiquy){
        this.noiquy=noiquy;
    }
    public int getlanthi(){
        return lanthi;
    }
    public void setlanthi(int lanthi){
        this.lanthi=lanthi;
    }
    void nhapvao(){
        System.out.println("có phải sinh viên HDSE không(y/n)? ");
        hdse= input.nextLine();
        System.out.println("điểm thi bao nhiêu thế? ");
        diem= input.nextInt();
        input.nextLine();
        System.out.println("đọc nội quy chưa hả(y/n)? ");
        noiquy=input.nextLine();
        System.out.println("thi bao nhiêu lần rồi hả ");
        lanthi= input.nextInt();
    }
    void hocbong(){
        if ((this.hdse=="y") && (this.diem>0.75) && (this.noiquy=="y") && (this.lanthi==1))
            System.out.println("học bổng nhé baby");
        else System.out.println("k có học bổng đâu mà mơ ");
    }
}
