/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: Ej05 - Código de 6 caracteres
 * Enunciado: 3 letras aleatorias y 3 dígitos aleatorios.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static void main(String[] args) {
        Random azar = new Random();
        StringBuilder codigo = new StringBuilder();

        // Generamos 3 letras mayúsculas aleatorias
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo.append(letra);
        }

        // Generamos 3 dígitos aleatorios
        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10);
            codigo.append(digito);
        }

        System.out.println("Código generado: " + codigo.toString());
    }
}