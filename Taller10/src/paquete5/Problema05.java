/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author JonathanCoronel
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        char inicialLetra;
        String mensaje = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                inicialLetra = estudiantes[fila][col].charAt(0);
                String inicial = String.valueOf(inicialLetra);
                if (inicial.equals("S") || inicial.equals("P")
                        || inicial.equals("T")) {
                    mensaje = String.format("%s%s\n", mensaje,
                             estudiantes[fila][col]);
                }
            }
        }
        System.out.printf("%s", mensaje);
    }
}
