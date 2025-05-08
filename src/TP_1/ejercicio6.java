/*Programa que calcula el producto de dos números enteros y positivos mediante sumas sucesivas. */
package TP_1;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num1, num2;
            int resultado = 0;

            do {
                System.out.print("Ingrese el primer numero entero: ");
                num1 = sc.nextInt();
                if (num1 <= 0) {
                    System.out.println("El numero debe ser mayor a 0. Vuelva a intentarlo.");
                }
            } while (num1 <= 0);
    
            do {
                System.out.print("Ingrese el segundo numero entero: ");
                num2 = sc.nextInt();
                if (num2 <= 0) {
                    System.out.println("El numero debe ser mayor a 0. Vuelva a intentarlo");
                }
            } while (num2 <= 0);

            for (int i = 0; i < num2; i++) {
                resultado += num1;
            }
            
            System.out.println("El producto de " + num1 + " x " + num2 + ", es: " + resultado);
            
            sc.close();
    }
}