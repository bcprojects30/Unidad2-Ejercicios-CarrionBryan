/*
 * Sesión: S09 - Métodos static
 * Ejercicio: Ej05 - esBisiesto(int anio)
 * Enunciado: Divisible para 4 y no para 100, o divisible para 400.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej05_VerificadorBisiesto {

    static boolean esBisiesto(int anio) {
        boolean condicionBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        return condicionBisiesto;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa un año para ver si es bisiesto: ");
        int anioIngresado = lector.nextInt();

        // Evaluamos la condición con el método y mostramos si se cumple o no
        System.out.println("¿Es año bisiesto?: " + esBisiesto(anioIngresado));

        lector.close();
    }
}