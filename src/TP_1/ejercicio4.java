/*Programa que calcule el factorial de un número entero y positivo. */
package TP_1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        int num = 0;

        System.out.print("Ingrese un numero entero positivo: ");
        num = sc.nextInt();

        if (num <= 0) {
            System.out.println("El numero debe ser mayor a 0");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
        sc.close();
    }
}