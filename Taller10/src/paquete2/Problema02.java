/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double suma = 0;
        String[] vededores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        int num;

        for (int fila = 0; fila < ventas.length; fila++) {
            System.out.printf("Ingrese las ventas del vendedor(a) %s\n",
                     vededores[fila]);
            num = 1;
            for (int col = 0; col < ventas[fila].length; col++) {
                System.out.printf("Ingrese la venta Nro %d : ", num);
                num = num + 1;
                ventas[fila][col] = entrada.nextDouble();
                suma = suma + ventas[fila][col];
            }
        }
        System.out.printf("Han realizado un total de $%.2f en ventas\n", suma);
    }
}
