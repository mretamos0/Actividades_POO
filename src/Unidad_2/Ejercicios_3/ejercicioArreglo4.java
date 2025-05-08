/*Llenar una matriz de 4x4 con números enteros entre 1 y 100. Permitir que el
usuario busque si un número está presente, solicitándolo por teclado*/
package Unidad_2.Ejercicios_3;
import java.util.Scanner;
import java.util.Random;

public class ejercicioArreglo4 {

    public static void main (String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int [4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1,100)+ 1;
                System.out.println("Matriz [" + i + "][" + j + "]: " + matriz[i][j]);
                
            }
        }

        System.out.print("Ingrese el número a buscar: ");
        int num = sc.nextInt();

        while (num < 1 || num > 100) {
            System.out.println("El numero debe ser entre 1 y 100. vuelva a ingresar: ");
            num = sc.nextInt();
        }

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("El número " + num + " se encuentra en la posición [" + i + "][" + j + "].");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número " + num + " No se encuentra en la matriz.");
        }

        sc.close();
    }
}