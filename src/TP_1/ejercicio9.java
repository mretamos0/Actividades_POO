/*Algoritmo que diga si un número entero positivo es primo o no*/
package TP_1;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;
        
        do {
            System.out.println("Ingrese un numero entero positivo: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Ingreso invalido. El numero debe ser un entero positivo. Vuelva a ingresar");
            }
        } while (num <= 0);

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("El numero " + num + ", es primo");
        } else {
            System.out.println("El numero " + num + ", no es primo");
        }
        
        sc.close();
    }
}
