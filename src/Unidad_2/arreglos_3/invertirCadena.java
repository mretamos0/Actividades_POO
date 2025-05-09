/*Escribí un programa que solicite al usuario ingresar una palabra o frase. 
El programa debe invertir la cadena ingresada y mostrar el resultado */
package Unidad_2.arreglos_3;
import java.util.Scanner;

public class invertirCadena {
    
    public static String invertir(String frase){
        String cadenaInvertida = new StringBuilder(frase).reverse().toString();
        return cadenaInvertida;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String frase = sc.nextLine();

        String resultado = invertir(frase);
        System.out.print("Cadena invertida: " + resultado);
       
        sc.close();
    }
}

