/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author DUONG BACH
 */
 public class dathuc {

private int n;
private double a[];

public int getN(){
	return n;
}
public void setN(int n){
	this.n  = n;
}

public double[] getA(){
	return a;
}

public dathuc() {
	n = 0;
	a = null;
}

public dathuc(int n) {
	
	this.n = n;
	a = new double[n];
}
public dathuc(double[] a) {
	
	this.n = a.length;
	this.a = new double[n];
	
	for (int i = 0; i < a.length; i++) {
		this.a[i] = a[i];
	}
}

public dathuc(dathuc b) {
	
	this.n = b.n;
	this.a = new double[n];
	
	for (int i = 0; i < this.a.length; i++) {
		this.a[i] = b.a[i];
	}
}

public void Input() {

	
	System.out.print("Nhap bac cua da thuc: ");
	int n = new Scanner(System.in).nextInt();
	
	a = new double[n];
	for (int i = 0; i < n; i++) {
		System.out.print("Bac thu " + i + " ");
		a[i] = new Scanner(System.in).nextDouble();
	}
	System.out.println();
	
}
public void Output() {

	for (int i = 0; i < a.length; i++) {
		if (i == 0)
			System.out.print(a[i] + " * X^" + i);
		else
			System.out.print(" + " + a[i] + " * X^" + i);
	}
	System.out.println(" ");
}

public dathuc Add(dathuc a) {
	
	dathuc c = new dathuc();

	int x = this.n > a.n ? this.n : a.n;

	c.n = x;
	for (int i = 0; i < x; i++) {
		c.a[i] = this.n > a.n ? this.a[i] : a.a[i];
	}
	
	int y = this.n <= a.n ? this.n : a.n;

	for (int i = 0; i < y; i++) {
		c.a[i] += (this.n < a.n ? this.a[i] : a.a[i]);
	}
	return c;
}   }   

