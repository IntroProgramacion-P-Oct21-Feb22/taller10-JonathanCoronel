/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author JonathanCoronel
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int fila = 0; fila < notasCuantitativas.length; fila++) {
            for (int col = 0; col < notasCuantitativas[fila].length; col++) {
                if (notasCuantitativas[fila][col] >= 0
                        && notasCuantitativas[fila][col] <= 2.9) {
                    notasCualitativas[fila][col] = "Insuficiente";
                } else {
                    if (notasCuantitativas[fila][col] >= 3
                            && notasCuantitativas[fila][col] <= 4.9) {
                        notasCualitativas[fila][col] = "Regular";
                    } else {
                        if (notasCuantitativas[fila][col] >= 5
                                && notasCuantitativas[fila][col] <= 7.9) {
                            notasCualitativas[fila][col] = "Buena";
                        } else {
                            if (notasCuantitativas[fila][col] >= 8
                                    && notasCuantitativas[fila][col] <= 9.5) {
                                notasCualitativas[fila][col] = "Muy Buena";
                            } else {
                                if (notasCuantitativas[fila][col] >= 9.6
                                        && notasCuantitativas[fila][col] <= 10) {
                                    notasCualitativas[fila][col] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }

            }
        }
        for (int fila = 0; fila < notasCuantitativas.length; fila++) {
            for (int col = 0; col < notasCuantitativas[fila].length; col++) {
                System.out.printf("%.2f --> %s\n", notasCuantitativas[fila][col],
                        notasCualitativas[fila][col]);
            }

        }
    }

}
