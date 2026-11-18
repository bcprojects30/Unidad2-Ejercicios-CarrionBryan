/*
 * Sesión: S09 - Métodos static
 * Ejercicio: Ej03 - promedio3(double a, double b, double c)
 * Enunciado: Devuelve el promedio de tres números.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej03_CalculadorPromedio {

    static double promedio3(double a, double b, double c) {
        double sumaTotal = a + b + c;
        return sumaTotal / 3.0;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        double valorUno = lector.nextDouble();
        System.out.print("Ingresa el segundo valor: ");
        double valorDos = lector.nextDouble();
        System.out.print("Ingresa el tercer valor: ");
        double valorTres = lector.nextDouble();

        // Calculamos el promedio mandando los tres valores al método
        double resultadoPromedio = promedio3(valorUno, valorDos, valorTres);
        System.out.println("El promedio final es: " + resultadoPromedio);

        lector.close();
    }
}