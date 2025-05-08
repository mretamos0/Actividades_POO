/*Escribir un programa que lea una cadena de texto por línea de comandos 
y cuente cuántas vocales contiene */
package Unidad_2.Ejercicios_3;
import java.util.Scanner;

public class ejercicioArreglo8 {
    
    public static int contarVocales(String cadena) {
        int contador = 0;
        String minuscula = cadena.toLowerCase();
        for (int i = 0; i < minuscula.length(); i++) {
            if (minuscula.charAt(i) == 'a' || minuscula.charAt(i) == 'e' || minuscula.charAt(i) == 'i' || minuscula.charAt(i) == 'o' || minuscula.charAt(i) == 'u'){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        int resultado = ejercicioArreglo8.contarVocales(cadena);
        System.out.print("La cadena '" + cadena + "' tiene " + resultado + " vocales");
        sc.close();
    }
}

