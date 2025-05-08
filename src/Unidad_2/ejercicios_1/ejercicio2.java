/*Dado un arreglo de enteros cuyos elementos son ingresados por teclado, 
mostrar en pantalla el mayor y menor de ellos */
package Unidad_2.ejercicios_1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros va a ingresar? ");
        int num = sc.nextInt();

        int enteros[] = new int [num]; 
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i=0; i < num ; i++) {
            System.out.print("Ingrese el numero N°" + (i+1) + ": ");
            enteros[i] = sc.nextInt();
        }

        /*Esto tambien sirve para reemplazar la linea 13 y 14 pero se debe poner luego 
        de ingresar todos los datos, ya que guarda los primeros valores
        int mayor = enteros[0];
        int menor = enteros[0];
        */

        for (int i=0; i < num; i++) {
            if (enteros[i] > mayor) {
                mayor = enteros[i];
            }
            if (enteros[i] < menor) {
                menor = enteros[i];
            }
        }
        System.out.print("\nEl numero mayor es: " + mayor);
        System.out.print("\nEl numero menor es: " + menor);

        sc.close();
    }
}