/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: Ej05 - Predicción de salida
 * Enunciado: Programa con 3 llamadas, salida predicha y salida real.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej05_PrediccionsSalida {

    static int calcularOperacion(int a) {
        a += 10;
        return a * 2;
    }

    public static void main(String[] args) {
        int valorInicial = 5;
        
        System.out.println(calcularOperacion(valorInicial));
        System.out.println(calcularOperacion(valorInicial));
        System.out.println(valorInicial);
    }
}

/*
 * SALIDA PREDICHA:
 * 30
 * 30
 * 5
 * 
 * SALIDA REAL:
 * 30
 * 30
 * 5
 */