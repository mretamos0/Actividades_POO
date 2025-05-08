/* Programa que genera la lista de los N primeros números primos, donde N es el dato de entrada */
package TP_1;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int encontrados = 0;
        int numActual = 2;
        
        do{
            System.out.print("Ingrese un numero entero: ");
            num = sc.nextInt();
            
            if (num <= 0) {
                System.out.println("Numero invalido. Debe ser mayor a 0. Vuelva a intentarlo");
            }
        } while(num <= 0);
        
        int[] primos = new int[num];

        while (encontrados < num) {
            boolean primo = true;

            for (int i = 2; i <= numActual / 2; i++) {
                if (numActual % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                primos[encontrados] = numActual;
                encontrados++;
            }
            numActual++;
        }

        System.out.println("Los primeros " + num + " numeros primos son:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

        sc.close();
    }
}