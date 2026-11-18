/*
 * Sesión: S09 - Métodos static
 * Ejercicio: Ej02 - imprimirTabla(int n)
 * Enunciado: Imprime la tabla de multiplicar de n (void).
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej02_ImpresorTabla {

    static void imprimirTabla(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " por " + i + " es " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa un número para sacarle la tabla de multiplicar: ");
        int numeroTabla = lector.nextInt();
        
        // Llamamos al método void pasándole el número que leyó el scanner
        imprimirTabla(numeroTabla);

        lector.close();
    }
}