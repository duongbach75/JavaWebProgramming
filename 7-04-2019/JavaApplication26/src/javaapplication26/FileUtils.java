/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author Student
 */
public class FileUtils {
    
    public void layFolder(String path){      
        File f1= new File(path);
        File[] list= f1.listFiles();
        for (File file : list) {
        if(!file.isFile())
          System.out.println(file);
            }
                
    }        
    public void layFile(String path){
        File f1= new File(path);
        File[] list= f1.listFiles();
        for (File file : list) {
        if(file.isFile())
          System.out.println(file);
            }
      
    }
    public void layanh(String path){
        File f1= new File(path);
        File[] list= f1.listFiles();
       for (File file : list) {
       if(file.getName().endsWith("png")||file.getName().endsWith("jpg")||file.getName().endsWith("jpeg") )
               System.out.println(file);
           }   
    }
    public void laymorong(String path, String ext){
       File f1= new File(path);
        File[] list= f1.listFiles();
       for (File file : list) {
       if(file.getName().endsWith(ext))
               System.out.println(file);
           }    
    }
    public void laythoigian(String path){
        File f1= new File(path);
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");		
	System.out.println("After Format : " + sdf.format(f1.lastModified()));
    }
    public void laykichthuoc(String path, String type){
        File f1= new File(path);
       double bytes = f1.length();
        double kilobytes = (bytes / 1024);
	 double megabytes = (kilobytes / 1024); 
         if(type=="Mb")
             System.out.println(megabytes);
         else 
             if (type=="Kb") {
                 System.out.println(kilobytes);
        }
    }
    }
    

