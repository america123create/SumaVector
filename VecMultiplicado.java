/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class VecMultiplicado {
    private int[] vector;

    public VecMultiplicado(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public VecMultiplicado multiplicarPorEscalar(int escalar) {
        int[] multiplicado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            multiplicado[i] = vector[i] * escalar;
        }
        return new VecMultiplicado(multiplicado);
    }

    public String imprimirVector() {
        String resultado = "";
        for (int valor : vector) {
            resultado += valor + " ";
        }
        return resultado;
    }
}
    

