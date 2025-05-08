/*Escribe un programa que averigüe si un número natural positivo es perfecto o no. 
Un número natural se denomina perfecto cuando es igual a la suma de todos sus divisores, primos o no excepto él mismo. 
Por ejemplo 28 = 1 + 2 + 4 + 7 + 14 */
package TP_1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 0;

        do {
            System.out.print("Ingrese un numero natural positivo: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.print("Ingreso invalido. El numero debe ser mayor a 0. Vuelva a ingresar");
            }
        } while (num <= 0);

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                contador += i;
            }
        }

        if (num == contador) {
            System.out.println("El numero " + num + " es un numero perfecto");
        } else {
            System.out.println("El numero " + num + " no es un numero perfecto");
        }
        sc.close();
    }
}
