/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: Ej04 - Reescribir sin static
 * Enunciado: Versión original comentada y la nueva usando parámetros y return.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /*
     * // VERSION ORIGINAL (usando atributos static globales - mal hábito):
     * static int numA = 5;
     * static int numB = 10;
     * static int resultadoGlobal = 0;
     * 
     * static void sumarGlobales() {
     *     resultadoGlobal = numA + numB;
     * }
     */

    // NUEVA VERSIÓN (usando parámetros y return, limpio y seguro):
    static int sumar(int a, int b) {
        int sumaLocal = a + b;
        return sumaLocal;
    }

    public static void main(String[] args) {
        int valorUno = 5;
        int valorDos = 10;

        int total = sumar(valorUno, valorDos);
        System.out.println("El resultado usando parámetros y return es: " + total);
    }
}