/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author DUONG BACH
 */
public class PhanSo {


    int tu;
    int mau;
 public PhanSo(int tu, int mau)
 {
  this.tu=tu;
  this.mau=mau;
 }
 public void setTu(int tu)
 {
  this.tu=tu;
 }
 public void setMau(int mau)
 {
  this.mau=mau;
 }
 public int getTu()
 {
  return this.tu;
 }
 public int getMau()
 {
  return this.mau;
 }
 public int USCLN(int a, int b)
 {
  while(a!=b)
  {
   if(a>b) a=a-b;
   else b=b-a;
  }
   return a;
 }
 public void rutGon()
 {
  int i=USCLN(this.getTu(),this.getMau());
  this.setTu(this.getTu()/i);
  this.setMau(this.getMau()/i);
 }
 public void congPS(PhanSo ps)
 {
  int a=(this.getTu()*ps.getMau()) + (ps.getTu()*this.getMau());
  int b=ps.getMau()*this.getMau();
  PhanSo k=new PhanSo(a,b);
  k.rutGon();
  System.out.println("Ket qua Cong: " + k.tu + "/" + k.mau);
 }
 public void truPS(PhanSo ps)
 {
  int a=(this.getTu()*ps.getMau()) - (ps.getTu()*this.getMau());
  int b=ps.getMau()*this.getMau();
  PhanSo k=new PhanSo(a,b);
  k.rutGon();
  System.out.println("Ket qua Cong: " + k.tu + "/" + k.mau);
 }
 public void nhanPS(PhanSo ps)
 {
  int a=ps.tu*this.tu;
  int b=ps.mau*this.mau;
  PhanSo k=new PhanSo(a,b);
  k.rutGon();
  System.out.println("Ket qua Cong: " + k.tu + "/" + k.mau);
 }
 public void chiaPS(PhanSo ps)
 {
  int a=this.tu*ps.mau;
  int b=this.mau*ps.tu;
  PhanSo k=new PhanSo(a,b);
  k.rutGon();
  System.out.println("Ket qua Cong: " + k.tu + "/" + k.mau);
 }
}
