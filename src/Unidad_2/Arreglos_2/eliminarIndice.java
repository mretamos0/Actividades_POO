/*Crear un arreglo cuyo tamaño se ingresa por línea de comando. 
Permitir al usuario ingresar por teclado un índice y eliminar el elemento correspondiente,
desplazando los demás */
package Unidad_2.Arreglos_2;
import java.util.Scanner;

public class eliminarIndice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño que tendra el arreglo: ");
        int n = sc.nextInt();
        int arreglo[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento N°" + (i+1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        
        int indice;

        do{
            System.out.print("Ingrese el índice del elemento que desea eliminar: ");
            indice = sc.nextInt();
            
            if (indice < 0 || indice >= n) {
                System.out.println("Índice invalido. se encuentra fuera de rango. vuelva a intentarlo");
            } else {
                for (int i = indice; i < n - 1; i++) {
                    arreglo[i] = arreglo[i + 1];
                }
            }

        } while (indice < 0 || indice >= n);
        
        System.out.print("Arreglo después de eliminar el índice " + indice + ": ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arreglo[i] + " ");
            }

        sc.close();
    }
}