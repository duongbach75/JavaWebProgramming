/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Menu {

    private Map<String, String> map;

    public Menu() {
        this.map = new HashMap<>();
        this.loadData("en");
    }

    public void loadData(String lang) {
        try {
            String fileName = "menu-" + lang + ".locale";
            BufferedReader reader
                    = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(fileName)));
            this.map.clear();
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] split = line.split("=");
                this.map.put(split[0], split[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.printf("\n------%s------", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("lang"));
            System.out.printf("\n7. %s", this.map.get("exit"));
            System.out.printf("\n%s", this.map.get("choose"));
            int c = Integer.parseInt(input.nextLine());
            
            switch (c) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.print(this.map.get("mess"));
                    int la = Integer.parseInt(input.nextLine());
                    if (la == 1)
                        this.loadData("en");
                    else if (la == 2)
                        this.loadData("vi");
                    else if (la == 3)
                        this.loadData("jp");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
            }
        }

    }
}