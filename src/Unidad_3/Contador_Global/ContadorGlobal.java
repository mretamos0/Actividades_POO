/*Crear una clase llamada ContadorGlobal que tenga un atributo static que lleve la cuenta de cuántas veces se ha llamado un método llamado incrementar().
Requerimientos:
    Todos los objetos comparten la misma cuenta.
    Agregar un método resetear() que debe colocar en 0 el valor de la cuenta
    Agregar el método obtenerCuenta() que devuelva la cantidad de veces que se llamó a incrementar()
    Crear un programa UsarContadorGlobal que cree varios objetos ContadorGlobal y llame a incrementar() desde varios
    Verificar que el contador compartido funcione correctamente */

package Unidad_3.Contador_Global;

public class ContadorGlobal {
    private static int contador = 0;

    public void incrementar() {
        contador++;
    }

    public static void resetear() {
        contador = 0;
    }

    public static int obtenerCuenta() {
        return contador;
    }
}
