/*Llenar una matriz cuadrada cuyo tamaño se ingresa por línea de comandos 
y generar su transpuesta */
package Unidad_2.Ejercicios_3;
import java.util.Scanner;
import java.util.Random;

public class ejercicioArreglo5{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Ingrese la cantidad de filas y columnas que tendra la matriz cuadrada: ");
        int n = sc.nextInt();

        int matriz[][] = new int [n][n];
        int transpuesta[][] = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1, 100) + 1;
                System.out.println("Matriz [" + i + "][" + j + "] : " + matriz[i][j]);

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        } 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Transpuesta [" + i + "][" + j + "] : " + transpuesta[j][i]);
            }
        }
        sc.close();
    }
}