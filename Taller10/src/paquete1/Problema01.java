/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author JonathanCoronel
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del problema 01
        double suma;
        double prom;
        String mensaje = "";
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        double[] promedios = new double[3];

        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < notas[fila].length; columna++) {
                suma = suma + notas[fila][columna];
            }
            prom = suma / notas[fila].length;
            promedios[fila] = prom;
        }
        for (int i = 0; i < promedios.length; i++) {
            mensaje = String.format("%sEstudiante: %s tiene un promedio de: "
                    + "%.2f\n", mensaje, estudiantes[i], promedios[i]);
        }
        System.out.printf("%s", mensaje);
    }

}
