/*Escribí un programa que solicite al usuario ingresar una palabra o frase. 
El programa debe invertir la cadena ingresada y mostrar el resultado */
package Unidad_2.Ejercicios_2;
import java.util.Scanner;

public class programa3 {
    
    public static String invertirCadena(String frase){
        String cadenaInvertida = new StringBuilder(frase).reverse().toString();
        return cadenaInvertida;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String frase = sc.nextLine();

        String resultado = invertirCadena(frase);
        System.out.print("Cadena invertida: " + resultado);
       
        sc.close();
    }
}

