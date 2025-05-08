/*Llenar un arreglo con 15 enteros aleatorios entre 1 y 10. Contar cuántas veces se
repite cada número
*/
package Unidad_2.Ejercicios_3;
import java.util.Random;

public class ejercicioArreglo2 {
    public static void main(String[] args){
        Random r = new Random();
        int arreglo[] = new int[15];
        int contador[] = new int[11];


        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = r.nextInt(1,10)+1; //significa que va a dar numeros aleatorios entre 1 y 10. sin el "+1" generaria elementos entre 1 y 9 
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
            contador[arreglo[i]]++;
        }

        System.out.println("\nVeces que se repite cada numero: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número " + i + ": " + contador[i]);
        }
    
    }
}
