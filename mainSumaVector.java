
import edu.mx.uttt.vectores.SumaVector;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class mainSumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los vectores:"));

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector1[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del primer vector:"));
        }

        for (int i = 0; i < tamaño; i++) {
            vector2[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del segundo vector:"));
        }

        VectorSuma v1 = new VectorSuma(vector1);
        VectorSuma v2 = new VectorSuma(vector2);

        suma suma = VectorSuma.sumarVectores(v1, v2);
        if (suma != null) {  // Si la suma es válida, mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de los vectores es: " + suma.imprimirVector());
        }
    }
    }
    }
    

