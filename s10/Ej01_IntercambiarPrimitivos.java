/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: Ej01 - intercambiar(int a, int b)
 * Enunciado: Intentar intercambiar dos variables primitivas de main.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;
    }

    public static void main(String[] args) {
        int numeroUno = 5;
        int numeroDos = 10;

        System.out.println("Antes de intercambiar: numeroUno = " + numeroUno + ", numeroDos = " + numeroDos);
        intercambiar(numeroUno, numeroDos);
        System.out.println("Despues de intercambiar: numeroUno = " + numeroUno + ", numeroDos = " + numeroDos);
    }
}

/*
 * ¿Funciona? ¿Por qué?
 * Pails, no funciona. Como Java hace paso por valor con los primitivos, al método 
 * solo le llega una copia de las variables. Lo que cambie adentro con a y b no 
 * le hace cosquillas a las originales del main.
 */