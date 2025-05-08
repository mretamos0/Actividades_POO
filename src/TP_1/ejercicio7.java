/*Programa que obtiene el cociente y el resto de dos números enteros y positivos mediante restas sucesivas. */
package TP_1;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cociente = 0;
        int num1, num2;

        do{
            System.out.print("Introduce el primer numero entero como dividendo: ");
            num1 = sc.nextInt();

            System.out.print("Introduce el segundo numero entero como divisor: ");
            num2 = sc.nextInt();

            if (num1 <= 0 ) {
                System.out.println("Ingreso invalido. El primer numero debe ser entero positivo. Vuelva a ingresar");

            }else if (num2 <= 0) {
                System.out.println("Ingreso invalido. El segundo numero debe ser entero positivo. Vuelva a ingresar");
            }
        } while (num1 <= 0 || num2 <= 0);
        
        int resto = num1;
        while (resto >= num2) {
            resto -= num2;
            cociente++;
        }

        System.out.println("El cociente de " + num1 + "/" + num2 + ", es: " + cociente + ", Y el resto es: " + resto);

        sc.close();
    }
}