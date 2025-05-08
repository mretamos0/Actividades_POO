/*Programa que lea una cierta cantidad de notas con valores de 0 a 10, que termina con el valor –1, y nos dice si hubo o no alguna con el valor 10 */
package TP_1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int nota = 0;

        System.out.print("Ingrese la nota (para salir ingrese -1): ");
        nota = sc.nextInt();
        
        while (nota != -1) {
            if (nota == -1) {
                break;
            }
            if (nota < 0 || nota > 10) {
                System.out.println("El valor ingresado es invalido, debe estar entre 0 y 10. Vuelva a intentarlo");
            }else if (nota == 10) {
                contador ++;
            }
            System.out.print("Ingrese la nota (para salir ingrese -1): ");
            nota = sc.nextInt();
        }

        if (contador > 0) {
            System.out.println("Hay " + contador + " nota/s con 10");
        } else {
            System.out.println("No hay notas con el valor 10");
        }
    
        sc.close();
    }
}
