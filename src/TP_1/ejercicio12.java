/*Escribe un programa que lea como dato de entrada una fecha expresada en día (1-31), mes (1-12) y año (en número) y nos dice la fecha que será al día siguiente. Considere, los años bisiestos */
package TP_1;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias, mes, año;

        do {
            System.out.print("Ingrese la fecha en dias (1-31): ");
            dias = sc.nextInt();
            System.out.print("Ingrese la fecha en meses (1-12): ");
            mes = sc.nextInt();
            System.out.print("Ingrese la fecha en años (numero): ");
            año = sc.nextInt();
            
            if (dias < 1 || dias > 31) {
                System.out.println("Dias ingresado invalido. Debe estar entre 1 y 31. Vuelva a intentarlo");
            } else if (mes < 1 || mes > 12) {
                System.out.println("Mes ingresado invalido. Debe estar entre 1 y 12. Vuelva a intentarlo");                
            } else if (año < 0) {
                System.out.println("Año ingresado invalido. Debe ser mayor 0. Vuelva a intentarlo");
            }
        } while (dias < 1 || dias > 31 || mes < 1 || mes > 12 || año < 0);

        dias ++;
        if ((dias > 28 && mes == 2) || (dias > 29 && mes == 2) || (dias > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (dias > 31)) {
            dias = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        System.out.println("Dia/Mes/Año: " + dias + "/" + mes + "/" + año);
        System.out.println("¿Es año bisiesto? " + (bisiesto ? "Sí" : "No"));
        sc.close();
    }    
}