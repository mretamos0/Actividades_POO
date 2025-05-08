/*Realizar un programa que solicite al usuario ingresar por teclado dos números enteros. 
El programa debe verificar si el segundo número es múltiplo del primero. Mostrar un mensaje indicando si lo es o no*/
package Unidad_2.Ejercicios_2;
import java.util.Scanner;

public class programa2 {
    
    public static boolean multiplo(int num1, int num2){
        return num2 % num1 == 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = sc.nextInt();
        
        if (num1 == 0) {
            System.out.println("El primer número no puede ser cero.");
            sc.close();
            return;
        }

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = sc.nextInt();
        
        boolean resultado = multiplo(num1, num2);

        if (resultado) {
            System.out.println("El número " + num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("El número " + num2 + " NO es múltiplo de " + num1);
        }

        sc.close();
    }
}