/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio: Ej03 - aplicarDescuento(double[] precios, double pct)
 * Enunciado: Modificar todo el arreglo de precios y mostrarlo antes y después.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

import java.util.Arrays;
import java.util.Locale;

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double porcentaje) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * (porcentaje / 100.0));
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] listaPrecios = {100.0, 250.0, 50.0};
        double porcentajeDescuento = 20.0;

        System.out.println("Precios antes del descuento: " + Arrays.toString(listaPrecios));
        aplicarDescuento(listaPrecios, porcentajeDescuento);
        System.out.println("Precios despues del descuento: " + Arrays.toString(listaPrecios));
    }
}