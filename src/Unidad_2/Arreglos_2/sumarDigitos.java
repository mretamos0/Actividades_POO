/*Escribir un programa que reciba por línea de comando un número entero y
calcule la suma de sus dígitos*/
package Unidad_2.Arreglos_2;
import java.util.Scanner;

public class sumarDigitos {
    
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
        int digito = numero % 10;
        suma += digito;
        numero = numero / 10;
        }
        return suma;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        int resultado = sumarDigitos.sumaDigitos(numero);
        System.out.print("La suma de los digitos del numero " + numero + " es: " + resultado);

        sc.close();
    }
}
