/*Programa que lee un número entero X y otro número entero positivo N y calcula la enésima potencia de X */
package TP_1;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exp;
        int res = 1;
        System.out.println("Ingrese la base (entero): ");
        base = sc.nextInt();
        
        System.out.println("Ingrese el exponente (entero positivo): ");
        exp = sc.nextInt();
        
        while (exp <= 0) {
            System.out.print("\nEl exponente debe ser mayor a 0. Vuelva a ingresarlo: ");
            exp = sc.nextInt();
        }

        for (int i = 0; i < exp; i++) {
            res *= base; 
        }
        
        System.out.print("El resultado de " + base + "^" + exp + ", es: " + res);

        sc.close();
    }
}
