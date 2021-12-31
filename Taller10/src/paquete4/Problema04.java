/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String mensaje = "";
        double[][] datos = new double[2][2];

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.printf("Ingrese los valores para la fila[%d] "
                        + "columna[%d] = ", fila, col);
                datos[fila][col] = entrada.nextDouble();
                mensaje = String.format("%sfila[%d] columna[%d] = %.2f\n",
                        mensaje, fila, col, datos[fila][col]);
            }
        }
        System.out.printf("Los valores ingresados fueron:\n%s", mensaje);
    }
}
