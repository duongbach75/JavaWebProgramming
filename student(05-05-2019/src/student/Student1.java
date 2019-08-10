/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author DUONG BACH
 */
public class Student1 {
    private String RollNumber;
    private String Name;
    private double date;

    public Student1() {
    }

    public Student1(String RollNumber, String Name, double date) {
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.date = date;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(String RollNumber) {
        this.RollNumber = RollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }
    
    
}
