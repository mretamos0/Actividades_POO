/*Desarrollar un programa que reciba dos parámetros desde la líneade comandos: 
el primero es un texto y el segundo es una palabra. El programa debe verificar 
si la palabra está contenida dentro del texto y mostrar un mensaje apropiado */
package Unidad_2.Ejercicios_2;
import java.util.Scanner;

public class programa1 {
    
    public static boolean buscarPalabra(String texto, String palabra){
        return texto.contains(palabra);
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el texto: ");
        String texto = sc.nextLine();
        
        System.out.print("Ingrese la palabra que desea buscar: ");
        String palabra = sc.nextLine();
        
        Boolean resultado = programa1.buscarPalabra(texto,palabra);
        
        if (resultado){
            System.out.println("La palabra \"" + palabra + "\" está contenida en el texto.");
        }else {
            System.out.println("La palabra \"" + palabra + "\" NO está contenida en el texto.");
        }   
        sc.close();
    }

}