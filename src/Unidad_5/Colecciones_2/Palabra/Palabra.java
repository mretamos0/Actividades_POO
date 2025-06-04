/*Crear un programa que contenga un ArrayList que almacene palabras ingresadas por el usuario. 
La carga de las mismas deberá finalizar cuando se ingrese la palabra "fin". A continuación mostrar todas las palabras ingresadas */
package Unidad_5.Colecciones_2.Palabra;
import java.util.Scanner;
import java.util.ArrayList;

public class Palabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaPalabras = new ArrayList<>();
        String p;

        System.out.println("-----Ingreso palabras-----");
        System.out.println("(Para salir ingrese la palabra 'fin')");

        do {
            System.out.print("Ingrese la palabra: ");
            p = sc.nextLine();

            if (p.equalsIgnoreCase("fin")) {
                System.out.println("-----Saliendo-----");
                break;
            }

            listaPalabras.add(p);
        } while (true);

        System.out.println("Lista de palabras: ");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
        sc.close();
    }
}