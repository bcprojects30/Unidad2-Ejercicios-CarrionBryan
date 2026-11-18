/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: Ej04 - Sobrecarga de perimetro
 * Enunciado: Las dos versiones (cuadrado y rectángulo) llamadas desde main.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return lado * 4;
    }

    static double perimetro(double base, double altura) {
        return (base * 2) + (altura * 2);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double perimetroCuadrado = perimetro(5.0);
        double perimetroRectangulo = perimetro(4.0, 3.0);

        System.out.printf("Perimetro del cuadrado: %.2f%n", perimetroCuadrado);
        System.out.printf("Perimetro del rectangulo: %.2f%n", perimetroRectangulo);
    }
}