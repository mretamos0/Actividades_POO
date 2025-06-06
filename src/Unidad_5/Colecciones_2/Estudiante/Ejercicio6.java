package Unidad_5.Colecciones_2.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        
        cargarArray(listaEstudiantes, sc);
        ordenarAlfabeticamenteNombre(listaEstudiantes);
        mostrarOrdenada(listaEstudiantes);
        sc.close();
    }

    public static void cargarArray(ArrayList<Estudiante> listaEstudiantes, Scanner sc) {
        System.out.println("Cargar Estudiantes:");
        String opcion = "";
        String nombre = "";
        int edad = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante N°" + (i+1) + "/5: ");
            nombre = sc.nextLine();
            
            System.out.print("Ingrese la edad del estudiante: ");
            edad = sc.nextInt();
            sc.nextLine();

            Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
            listaEstudiantes.add(nuevoEstudiante);
        }

        System.out.println("\nSe han añadido el minimo de estudiantes (5).");
    
        while(true) {
            while(true) {
                System.out.print("¿Quiere ingresar otro estudiante? 'Si'/'No': ");
                opcion = sc.nextLine();

                if (opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("\nIngreso invalido. Debe ser 'Si'/'No'. Vuelva a intentar.");
                }
            }   

            if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Saliendo...");
                break;
            } 

            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese la edad del estudiante: ");
            edad = sc.nextInt();
            sc.nextLine();

            System.out.println("\nSe ha añadido el estudiante");
            Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
            listaEstudiantes.add(nuevoEstudiante);
        }
    }

    public static void ordenarAlfabeticamenteNombre(ArrayList<Estudiante> listaEstudiantes) {
        Collections.sort(listaEstudiantes);
    }

    public static void mostrarOrdenada(ArrayList<Estudiante> listaEstudiantes) {
        System.out.println("\nLista de estudiantes ordenada: ");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("-" + estudiante);
        }
    }
}