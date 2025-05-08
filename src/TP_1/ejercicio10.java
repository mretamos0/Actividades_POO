/*. Dado un número entero positivo N, escribe un programa que determine cuántos dígitos se necesitan para escribir el valor N. 
Por ejemplo, 99 necesita 2 dígitos, 115 necesita 3, para 1000 la salida es 4 */
package TP_1;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero entero positivo: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("El numero debe ser mayor a 0. Vuelva a ingresar");
            }
        } while (num <= 0);

        int digito = Integer.toString(num).length();
        System.out.println("El numero " + num + ", tiene " + digito + " digitos");
        sc.close();
    }    
}
