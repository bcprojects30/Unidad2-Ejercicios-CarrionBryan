/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: Ej01 - Marcar ámbitos
 * Enunciado: Programa con comentario en cada variable que diga si es local, de bloque o static.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej01_MarcarAmbito {

    static int contadorGlobal = 100; // static: vive toda la ejecución y lo comparte toda la clase

    static void calcular(int parametroMetodo) { // local: parámetro que existe solo dentro de este método
        int variableLocalMetodo = 50; // local: existe desde aquí hasta que termina el método
        
        System.out.println("Global: " + contadorGlobal + ", Local método: " + variableLocalMetodo);
    }

    public static void main(String[] args) { // local: args es local del main
        int sumaTotal = 0; // local: vive en todo el main

        for (int i = 1; i <= 3; i++) { // de bloque: i solo existe dentro de estas llaves del for
            int auxiliarBloque = i * 10; // de bloque: nace y muere en cada vuelta del ciclo
            sumaTotal += auxiliarBloque;
        }

        System.out.println("Suma total: " + sumaTotal);
    }
}