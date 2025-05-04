/*Escribir un programa que reciba por línea de comando un número entero y
calcule la suma de sus dígitos*/
package arreglos.ejercicios3;
import java.util.Scanner;

public class ejercicioArreglo10 {
    
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

        int resultado = ejercicioArreglo10.sumaDigitos(numero);
        System.out.print("La suma de los digitos del numero " + numero + " es: " + resultado);

        sc.close();
    }
}
