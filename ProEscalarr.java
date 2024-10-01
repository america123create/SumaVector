
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ProEscalar {
    private int[] vector;

    public ProEscalar(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public static Integer proEscalar(ProEscalar v1, ProEscalar v2) {
        if (v1.vector.length != v2.vector.length) {
            JOptionPane.showMessageDialog(null, "Error: Los vectores deben tener el mismo tamaño.");
            return null; // Regresa null en caso de error
        }

        int producto = 0;
        for (int i = 0; i < v1.vector.length; i++) {
            producto += v1.vector[i] * v2.vector[i];
        }
        return producto;
    }
    
}
