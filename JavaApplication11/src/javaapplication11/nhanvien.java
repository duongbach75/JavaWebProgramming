/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class nhanvien {
          private String name;
          private int tuoi;
          private String address;
          private double money;
          private int time;
          Scanner input= new Scanner(System.in);

    public nhanvien() {
    }

    public nhanvien(String name, int tuoi, String address, double money, int time) {
        this.name = name;
        this.tuoi = tuoi;
        this.address = address;
        this.money = money;
        this.time = time;
    }
      public String getname(){
          return name;
      }
      public  void setname(String name){
          this.name= name;
      }
       public int getuoi(){
          return tuoi;
      }
      public  void settuoi(int tuoi){
          this.tuoi= tuoi;
      }
       public String getaddress(){
          return address;
      }
      public  void setaddress(String address){
          this.address= address;
      }
       public double getmoney(){
          return money;
      }
      public  void setmoney(double money){
          this.money= money;
      }     
       public int gettime(){
          return time;
      }
      public  void settime(int time){
          this.time= time;
      }
      void inputInfo(){
          System.out.println("nhập tên ");
          name= input.nextLine();
          System.out.println("nhập tuoi ");
          tuoi= Integer.parseInt(input.nextLine());
          System.out.println("nhập địa chỉ ");
          address= input.nextLine();
          System.out.println("nhập tiền lương ");
          money= input.nextInt();
          System.out.println("nhập thời gian ");
          time= input.nextInt();
      }
      void printfInfo(){
          System.out.println("tên là "+this.name);
          System.out.println("tuổi là "+this.tuoi);
          System.out.println("địa chỉ là "+this.address);
          System.out.println("tiền lương là "+this.money);
          System.out.println("thời gian là "+this.time);
      }
      double tinhThuong()
      {
          if(this.time>200)
              return this.money*20/100;
          else
          if ((this.time<200) && (this.time>=100))
              return money*1/10;
          else
              return 0;
      }
}
