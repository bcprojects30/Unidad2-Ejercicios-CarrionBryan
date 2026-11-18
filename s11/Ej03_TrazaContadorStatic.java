/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: Ej03 - Traza del contador static
 * Enunciado: Programa y tabla línea | variables vivas | valor en comentario.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int conteoVeces = 0;

    static void sumar() {
        conteoVeces++;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            sumar();
            System.out.println("Vuelta: " + i + " | Conteo: " + conteoVeces);
        }
    }
}

/*
 * TABLA DE TRAZA (línea | variables vivas | valor):
 * - Línea 11 (inicia main): [args: vacío, conteoVeces: 0]
 * - Línea 12 (i = 1):      [args: vacío, conteoVeces: 0, i: 1]
 * - Línea 13 (tras sumar): [args: vacío, conteoVeces: 1, i: 1]
 * - Línea 12 (i = 2):      [args: vacío, conteoVeces: 1, i: 2]
 * - Línea 13 (tras sumar): [args: vacío, conteoVeces: 2, i: 2]
 */