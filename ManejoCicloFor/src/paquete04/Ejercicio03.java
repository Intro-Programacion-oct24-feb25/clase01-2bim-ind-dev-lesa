/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        int contador;
        int i;
        for (i = 1; i <= 5; i++) {
            for (contador = 1; contador <= i; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        for (i = 5; i >= 1; i--) {
            for (contador = 1; contador <= i; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }

    }
}
