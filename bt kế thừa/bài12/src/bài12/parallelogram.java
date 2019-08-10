/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài12;

/**
 *
 * @author DUONG BACH
 */
public class parallelogram extends polygon {
  private int chieucao ;
  
public parallelogram(){
    
}

    public parallelogram(int chieucao) {
        this.chieucao = chieucao;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }
  public int hbh(int a, int b){
      int hbh= a*b;
      return hbh;
  }
}
