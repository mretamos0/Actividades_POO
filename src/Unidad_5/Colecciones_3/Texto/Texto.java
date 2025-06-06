/*Escriba un programa que lea por teclado un texto cualquiera, y permita obtener estadísticas tales como:
a. cantidad de palabras
b. cantidad de caracteres
c. frecuencia de aparición de las palabras */
package Unidad_5.Colecciones_3.Texto;
import java.util.Scanner;

public class Texto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        cantidadPalabras(texto);
        cantidadCaracteres(texto);
        frecuenciaAparicionPalabras(texto);
        sc.close();
    }

    public static void cantidadPalabras(String texto) {
        int cantidadPalabras = texto.trim().split("\\s+").length; 
        //trim quita los espacios en blanco que hay al inicio y final del texto 
        //split("\\s") separa la cadena en un arreglo de strings, usando como separador uno o mas espacios en blanco consecutivos que hay en el texto. ("\\s") significa "todo espacio en blanco"
        System.out.println("- Cantidad de palabras del texto: " + cantidadPalabras);
    }

    public static void cantidadCaracteres(String texto) {
        int cantidadCaracteres = texto.replace(" ", "").length(); //replace(" ", "") quita todos los espacios del texto para contar solo las letras
        System.out.println("- Cantidad de caracteres del texto: " + cantidadCaracteres);
    }

    public static void frecuenciaAparicionPalabras(String texto) {
        String palabras[] = texto.toLowerCase().trim().split("\\s");
        boolean contada[] = new boolean[palabras.length];

        System.out.println("- Frecuencia de aparicion de las palabras: ");
        for (int i = 0; i < palabras.length; i++) {
            if (!contada[i]) {
                int contador = 1;
                for (int j = i + 1; j < palabras.length; j++) {
                    if (palabras[i].equals(palabras[j])) {
                        contador++;
                        contada[j] = true;
                    }
                }
                System.out.println("(" + palabras[i] + ": " + contador + ")");
            }
        }
    }
}