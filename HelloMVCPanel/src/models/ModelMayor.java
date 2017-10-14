/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class ModelMayor {
    private int n1=4;
    private int n2=6;
    private int n3=7;
    private int m=0;

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }
    
      public int getN3() {
        return n3;
    }

    public int getM() {
        return m;
    }
   

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setM(int m) {
        this.m = m;
    }

  
    public void mayor(){
        m=n1;
        if (n2>m){
            m=n2;
        }
        if (n3>m){
            m=n3;
        }
    }

}
