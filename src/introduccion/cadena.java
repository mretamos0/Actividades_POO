//Dada una cadena ingresada por teclado, indicar el largo y cantidad de veces que aparece la letra ‘a’ en la misma
package introduccion;
import java.util.Scanner;

public class cadena {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena: ");
        String cadena = scanner.nextLine();

        int largo = cadena.length();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                contador++;
            }
        }

    System.out.println("El largo de la cadena es: " + largo);
    System.out.println("La cantidad de veces que aparece la letra 'a' o 'A' es: " + contador);
    scanner.close();
    }
}
