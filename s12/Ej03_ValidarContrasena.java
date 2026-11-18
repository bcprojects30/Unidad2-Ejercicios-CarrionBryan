/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio: Ej03 - Validar contraseña
 * Enunciado: Mínimo 8 caracteres, al menos una mayúscula y un dígito, usando Character.
 * Autor: Bryan Carrión
 * Fecha: 18/11/2026
 */

public class Ej03_ValidarContrasena {

    static boolean validar(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char caracter = clave.charAt(i);
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        String clavePrueba = "Programacion2026";

        if (validar(clavePrueba)) {
            System.out.println("La contraseña '" + clavePrueba + "' es válida.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }
}