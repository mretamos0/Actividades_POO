/*Crear un programa que contenga un ArrayList de enteros. Cargar 10 números al azar utilizando Math.random(). 
Desarrollar una función que calcule el promedio de los mismos y que dicho resultado sea luego mostrado en pantalla desde el programa principal. */
package Unidad_5.Colecciones_2.Promedio;
import java.util.ArrayList;

public class Promedio {
    public static void main(String[] args) {
        ArrayList <Integer> listaEnteros = new ArrayList<>();
        int suma = 0;

        for(int i = 0; i < 10; i++) {
            int numero = (int)(Math.random() * 100) + 1; //Este rango va de 1 a 100
            listaEnteros.add(numero);
            suma += numero;
        }
        
        System.out.println("Lista de numeros enteros:");
        for(int numero : listaEnteros) {
            System.out.println("-" + numero);
        }
        calcularPromedio(listaEnteros, suma);
    }

    public static void calcularPromedio(ArrayList<Integer> listaEnteros, int suma) {
        double promedio = (double) suma / listaEnteros.size();
        System.out.println("\nEl promedio es: " + promedio);
    } 
}