/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUONG BACH
 */
public class SimpleVim {
    public void input(String path){
        Scanner input= new Scanner(System.in);
  File f= new File(path);
        try {
            FileWriter fw= new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("nhập văn bản vào");
        String s= input.nextLine();
        while(true)
        if(s.endsWith(":q")){
          
            fw.close();
            bw.close();
        }else
        if(s.endsWith("wq")){
            bw.write(s);
        fw.close();
        bw.close();
        }
        } catch (IOException ex) {
            Logger.getLogger(SimpleVim.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
