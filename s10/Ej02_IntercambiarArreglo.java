/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: Ej02 - intercambiar(int[] v, int i, int j)
 * Enunciado: Intercambiar dos posiciones de un arreglo.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

    public static void main(String[] args) {
        int[] valores = {10, 20, 30};

        System.out.println("Antes de intercambiar: " + Arrays.toString(valores));
        intercambiar(valores, 0, 2);
        System.out.println("Despues de intercambiar: " + Arrays.toString(valores));
    }
}

/*
 * ¿Por qué ahora sí funciona?
 * Aquí sí camina porque con los arreglos pasamos la referencia en memoria. 
 * El método apunta exactamente al mismo vector original, así que al mover las 
 * posiciones con los índices, el cambio se queda guardado y se ve en el main.
 */