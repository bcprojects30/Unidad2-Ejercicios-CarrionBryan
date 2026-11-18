/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: Ej04 - Contar vocales
 * Enunciado: Usar String y Character, contando mayúsculas y minúsculas.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej04_ContarVocales {

    static int contarVocales(String frase) {
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            char cMinuscula = Character.toLowerCase(c);
            
            if (cMinuscula == 'a' || cMinuscula == 'e' || cMinuscula == 'i' || cMinuscula == 'o' || cMinuscula == 'u' ||
                cMinuscula == 'á' || cMinuscula == 'é' || cMinuscula == 'í' || cMinuscula == 'ó' || cMinuscula == 'ú') {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        String texto = "Universidad de las Fuerzas Armadas ESPE";
        int totalVocales = contarVocales(texto);
        
        System.out.println("La frase tiene " + totalVocales + " vocales.");
    }
}