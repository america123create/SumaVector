/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.vectores;

/**
 *
 * @author Lenovo
 */
public class SumaVector {
    
    private int [] v1;
    private int [] v2;
    private int[] vector;

    
    private int tam;
    
    public SumaVector( int tam){
        if (tam>0) {
            v1 = new int [tam];
            v2 = new int [tam];
        }else{
            v1 = new int [1];
            v2 = new int [1];
        }
    }

      public int getTam() {
        return this.tam;
    }
    
    public int[] getV1() {
        return v1;
    }

    public int[] getV2() {
        return v2;
    }

    public void setV1(int v1 []) {
        if (v1.length == tam) {
            for (int i = 0; i < v1.length; i++) {
            this.v1[i] = v1[i];
        }
    }
    }

    public void setV2(int[] v2) {
        if (v2.length == this.v2.length) {
            int i = 0;
            while(i< v2.length)  {
            this.v2[i] = v2[i];
            i++;
        }
    }
    }
public String imprimirVector() {
        String resultado = "";
        for (int valor : vector) {
            resultado += valor + " ";
        }
        return resultado;
    }
}
  
          
      
   
    
