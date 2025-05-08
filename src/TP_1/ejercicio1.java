/* Programa que lea 3 números y los muestre ordenados de forma ascendente. */
package TP_1;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el numerosero N°" + (i+1) + ": ");
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);
        System.out.println("Números ordenados de forma ascendente:");
        for (int i : num) {
            System.out.println(i);
        }

        sc.close();
    }
}
