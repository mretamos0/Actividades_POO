/*Crear un programa que cree una matriz de 4x4 de enteros y muestre por pantalla
el promedio de estos números y la suma de sus diagonales */
package Unidad_2.arreglos_1;
import java.util.Scanner;

public class promiedo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int [4][4];
        int suma = 0;
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print("Ingrese el elemento de la matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];

                if (i == j) {
                    diagonalPrincipal += matriz[i][j];
                }

                if (i + j == matriz.length - 1) {
                    diagonalSecundaria += matriz[i][j];
                
                }
            }
        }
        float promedio = (float) suma / (matriz.length * matriz[0].length);

        System.out.print("\nEl promedio de la matriz es: " + promedio);
        System.out.print("\nLa suma de la diagonal principal es: " + diagonalPrincipal + ", y la suma de la diagonal secundaria es: " + diagonalSecundaria);
        sc.close();
    }
}
