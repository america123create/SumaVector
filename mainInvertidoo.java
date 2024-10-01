
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class mainInvertido {
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector:"));

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del vector:"));
        }

        VectorInvertido v = new VectorInvertido(vector);
        VectorInvertido invertido = v.invertirVector();

        JOptionPane.showMessageDialog(null, "El vector invertido es: " + invertido.imprimirVector());
    }    }
    

