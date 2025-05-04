/*Crear una matriz de 3x3 con números enteros y 
calcular la suma total de sus elementos */
package arreglos.ejercicios3;

public class ejercicioArreglo3 {

    public static void main(String[] args){
        int matriz[][] = new int [3][3];
        matriz[0][0] = 5;
        matriz[0][1] = 10;
        matriz[0][2] = 15;
        
        matriz[1][0] = 20;
        matriz[1][1] = 25;
        matriz[1][2] = 30;

        matriz[2][0] = 35;
        matriz[2][1] = 40;
        matriz[2][2] = 45;

        int suma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }

        System.out.print("La suma de todos los elementos de la matriz es: " + suma);

    }
}
