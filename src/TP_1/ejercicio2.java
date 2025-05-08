/*Programa que recibe como dato de entrada una hora expresada horas, minutos y segundos y escribe la nueva hora transcurrido 1 segundo */
package TP_1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la hora (en formato de 24hs): ");
        int hora = sc.nextInt();
        
        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = sc.nextInt();

        segundos += 1;
        if (segundos > 59) {
            segundos = 0;
            minutos += 1;
            if (minutos > 59) {
                minutos = 0;
                hora += 1;
                if (hora > 23) {
                    hora = 0;
                }
            }
        } 

        System.out.println("La hora nueva con 1 segundo trascurrido es: " + hora + ":" + minutos + ":" + segundos);
        
        sc.close();
    }
}