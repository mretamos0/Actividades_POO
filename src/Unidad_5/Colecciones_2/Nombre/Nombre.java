/*Crear un programa que contenga un ArrayList de nombres que deberán ser ingresados por teclado. 
Crear una función que permita eliminar un elemento del mismo dado el nombre correspondiente del ArrayList. 
Crear un procedimiento que muestre todos los nombres contenidos en la lista de la lista pasada por parámetros. */
package Unidad_5.Colecciones_2.Nombre;
import java.util.ArrayList;
import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de nombres a registrar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre N°" + (i+1) + "/" + cantidad + ": ");
            String nombre = sc.nextLine();
            listaNombres.add(nombre);
        }

         if (listaNombres.isEmpty()) {
            return;
        }else {
            eliminarNombre(listaNombres, sc);
            mostrarNombres(listaNombres);
        }
        sc.close();
    }

    public static void eliminarNombre(ArrayList<String> listaNombres, Scanner sc) {
        String opcion;

        while(true) {
            while(true) {
                System.out.print("\n¿Quiere eliminar un nombre? 'Si'/'No': ");
                opcion = sc.nextLine();
            
                if(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("El ingreso es invalido. Debe ingresar 'Si' o 'No'. Vuelva a intentar.");
                }
            }
            if (opcion.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el nombre que quiere eliminar: ");
                String nombreEliminar = sc.nextLine();
                boolean eliminado = false;

                for (int i = 0; i < listaNombres.size(); i++) {
                    if (listaNombres.get(i).equalsIgnoreCase(nombreEliminar)) {
                        listaNombres.remove(i);
                        eliminado = true;
                        System.out.println("El nombre '" + nombreEliminar + "' se ha eliminado.");
                        break;
                    }
                }

                if(!eliminado) {
                    System.out.println("El nombre '" + nombreEliminar + "' no esta en la lista");
                }
            } else {
                System.out.println("Saliendo...");
                break;
            }
        }
    }

    public static void mostrarNombres(ArrayList<String> listaNombres) {
        System.out.println("\nLista de nombres: ");
        for(String n : listaNombres) {
            System.out.println("-" + n);
        }
    }
}