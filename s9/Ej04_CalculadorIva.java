/*
 * Sesión: S09 - Métodos static
 * Ejercicio: Ej04 - ivaIncluido(double precio)
 * Enunciado: Devuelve el precio con IVA del 15%.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej04_CalculadorIva {

    static double ivaIncluido(double precio) {
        double valorConIva = precio * 1.15;
        return valorConIva;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto sin IVA: ");
        double precioProducto = lector.nextDouble();

        // Aquí aplicamos el 15% de IVA llamando al método
        double totalConIva = ivaIncluido(precioProducto);
        System.out.println("El precio ya con el IVA incluido es: " + totalConIva);

        lector.close();
    }
}