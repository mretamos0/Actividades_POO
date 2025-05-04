/*Multiplicar dos matrices compatibles de tamaño 2x3 y 3x2, 
que se llenan con valores aleatorios entre 0 y 10*/
package arreglos.ejercicios3;
import java.util.Random;

public class ejercicioArreglo6{

    public static void main(String[] args) {
        Random r = new Random();

        int matriz1[][] = new int [2][3];
        int matriz2[][] = new int [3][2];
        int matriz3[][] = new int [2][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = r.nextInt(10) + 1;
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = r.nextInt(10) + 1;
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        //Incializamos en 0 cada posicion de la matriz para guardar ahi la multiplicacion entre matriz1 y matriz2
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = 0;

                for (int k = 0; k < matriz1[0].length; k++) {
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}