//Crear un programa que permita introducir por línea de comandos 10 elementos de tipo entero en un arreglo, 
//el programa deberá mostrar impreso el arreglo en orden inverso
package Unidad_2.arreglos_1;
import java.util.Scanner;

public class inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementos[] = new int [10];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Ingrese el valor del elemento n°" + (i+1) + ": ");
            elementos[i] = sc.nextInt();
        }
        System.out.println("\nArreglo en orden inverso: ");
        for (int i = elementos.length -1; i >= 0; i--){
            System.out.print(elementos[i] + " ");
        }     

        sc.close();
    }
}
