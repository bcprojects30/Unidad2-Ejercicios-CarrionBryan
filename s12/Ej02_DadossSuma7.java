/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: Ej02 - Dados que suman 7
 * Enunciado: 1000 lanzamientos con Random, mostrar el conteo y el porcentaje.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Locale;
import java.util.Random;

public class Ej02_DadossSuma7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random azar = new Random();
        
        int totalLanzamientos = 1000;
        int contadorSiete = 0;

        for (int i = 0; i < totalLanzamientos; i++) {
            int dadoUno = azar.nextInt(6) + 1;
            int dadoDos = azar.nextInt(6) + 1;
            
            if (dadoUno + dadoDos == 7) {
                contadorSiete++;
            }
        }

        double porcentaje = (double) contadorSiete / totalLanzamientos * 100.0;

        System.out.println("Veces que sumaron 7: " + contadorSiete);
        System.out.printf("Porcentaje de aciertos: %.2f%%%n", porcentaje);
    }
}