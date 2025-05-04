/*Realizar un programa que cree un arreglo de enteros de un tamaño pasado por teclado, 
el arreglo deberá completarse con números aleatorios. Mostrar en pantalla el mayor y menor de ellos*/


package arreglos.ejercicios1;
//Comento esta otra forma de rellenar el arreglo pero con numeros ingresados por teclado. Descomentado uso random para completar aleatoriamente
import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("Ingrese la cantidad de elementos que tendra el arreglo: ");
        int n = sc.nextInt();

        int arreglo[] = new int [n];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("\nValores del arreglo: ");
        for (int i=0; i < n; i++){

            /* forma de hacerlo con ingreso por pantalla
            System.out.print("Ingrese el valor N°" + (i+1) + " :");
            arreglo[i] = sc.nextInt();
            */
            
            arreglo[i] = ran.nextInt(100) + 1; //Como parametro ponemos un numero aleatorio entre 1 y 100. si solo pongo (100), me da valores hasta 99, por eso pongo el "+ 1", para que llegue a 100 el rango 
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);

            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }

        System.out.print("\nEl numero mayor es: " + mayor + ", y el menor es: " + menor);

        sc.close();
    }
}
