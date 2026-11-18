/*
 * Sesión: S09 - Métodos static
 * Ejercicio: Ej01 - esMultiplo(int a, int b)
 * Enunciado: Devuelve true si a es múltiplo de b.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej01_VerificadorMultiplo {

    static boolean esMultiplo(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numeroUno = lector.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numeroDos = lector.nextInt();
        
        // Aquí probamos si el primer número es múltiplo del segundo usando el método de arriba
        System.out.println("¿Es múltiplo?: " + esMultiplo(numeroUno, numeroDos));

        lector.close();
    }
}