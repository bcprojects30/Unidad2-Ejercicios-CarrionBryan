/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: Ej01 - Distancia entre dos puntos
 * Enunciado: Usar Math.sqrt y Math.pow.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Locale;

public class Ej01_DistanciaPuntos {

    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double xUno = 1.0, yUno = 2.0;
        double xDos = 4.0, yDos = 6.0;

        double distancia = calcularDistancia(xUno, yUno, xDos, yDos);
        System.out.printf("La distancia entre los puntos es: %.2f%n", distancia);
    }
}