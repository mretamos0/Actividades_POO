/*Llenar una matriz 5x5 con enteros aleatorios del 1 al 100 
y cuenta cuántos números pares contiene */
package Unidad_2.Arreglos_2;
import java.util.Random;


public class matriz5x5 {
    public static void main(String[] args) {
        Random r = new Random();
        int matriz[][] = new int [5][5];
        int contador = 0;

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1,100) + 1;
                System.out.print(matriz[i][j] + "\t");
                
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
            System.out.println();
        }
        System.out.print("\nLa cantidad de numeros pares que tiene la matriz es: " + contador);
    }
}
