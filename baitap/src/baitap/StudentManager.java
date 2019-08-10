/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class StudentManager {

    private static final int MAX_STUDENT = 20;
    private Student[] listStudents;
    private int currQuantity;

    public StudentManager() {
        this.listStudents = new Student[MAX_STUDENT];
        this.currQuantity = 0;
    }

    public boolean add(Student s) {
        if (currQuantity < MAX_STUDENT) {
            this.listStudents[this.currQuantity] = s;
            this.currQuantity++;
            return true;
        } else {
            return false;
        }
    }

    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < this.listStudents.length; i++) {
            Student temp = this.listStudents[i];
            if (temp == null) continue;
            if (temp.getName().equals(name)) {
                System.out.println(temp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay");
        }
    }

    public void list() {
//        for (int i = 0; i < listStudents.length; i++) {
//            System.out.println(listStudents[i]);
//        }
        for (Student student : listStudents) {
            if (student != null)
                System.out.println(student);
        }
    }

    public void list(boolean order) {
        if (order) {
            // sap theo tang dan
            for (int i = 0; i < this.listStudents.length - 1; i++) {
                for (int j = 0; j < this.listStudents.length; j++) {
                    if (this.listStudents[i] == null || this.listStudents[j] == null) continue;
                    if (this.listStudents[i].getName().compareTo(this.listStudents[j].getName()) < 0) {
                        Student temp = this.listStudents[i];
                        this.listStudents[i] = this.listStudents[j];
                        this.listStudents[j] = temp;
                    }
                }
            }
        } else {
            // sap theo giam dan
            for (int i = 0; i < this.listStudents.length - 1; i++) {
                for (int j = 0; j < this.listStudents.length; j++) {
                    if (this.listStudents[i] == null || this.listStudents[j] == null) continue;
                    if (this.listStudents[i].getName().compareTo(this.listStudents[j].getName()) > 0) {
                        Student temp = this.listStudents[i];
                        this.listStudents[i] = this.listStudents[j];
                        this.listStudents[j] = temp;
                    }
                }
            }
        }

        for (Student student : listStudents) {
            if (student != null)
                System.out.println(student);
        }
    }
}