/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio: Ej02 - Líneas que no compilan
 * Enunciado: Líneas con error comentadas (//), con el mensaje del compilador y la causa.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej02_LineasNoCompilan {

    static void ejecutarPrueba() {
        int resultadoInterno = 500;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Valor: " + i);
        }

        /*
         * ERROR 1:
         * System.out.println(i);
         * Mensaje del compilador: cannot find symbol [symbol: variable i]
         * Causa: 'i' es una variable de bloque del for, ya murió al cerrarse la llave, 
         * así que aquí afuera ya no existe.
         */

        ejecutarPrueba();

        /*
         * ERROR 2:
         * System.out.println(resultadoInterno);
         * Mensaje del compilador: cannot find symbol [symbol: variable resultadoInterno]
         * Causa: 'resultadoInterno' es una variable local del método ejecutarPrueba, 
         * por lo que el método main no tiene idea de su existencia.
         */
    }
}