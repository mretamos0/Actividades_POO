package Unidad_5.Colecciones_3.Estudiante;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class UsarEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        
        registrarEstudiantes(listaEstudiantes, sc);
        ordenarPorNotaFinal(listaEstudiantes);
        promedioGeneral(listaEstudiantes);
        estudianteMejorNota(listaEstudiantes);
        sc.close();
        
    }

    public static void registrarEstudiantes(ArrayList<Estudiante> listaEstudiantes, Scanner sc) {
        System.out.println("- Registrar estudiantes");

        System.out.print("Ingrese el numero de estudiantes a registrar: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < opcion; i++) {
            System.out.print("\nIngrese el nombre del estudiante N°" + (i+1) + "/" + opcion + ": ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Ingrese la nota final: ");
            int notaFinal = sc.nextInt();
            sc.nextLine();

            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, notaFinal);
            listaEstudiantes.add(nuevoEstudiante);
            System.out.println("Estudiante registrado");
        }
    }

    public static void ordenarPorNotaFinal(ArrayList<Estudiante> listaEstudiantes) {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No se puede ordenar la lista ya que no hay estudiantes registrados.");
        }

        listaEstudiantes.sort(Comparator.comparingInt(Estudiante :: getNotaFinal).reversed());
        
        System.out.println("\n- Lista ordenada por nota final de forma descendente: ");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    } 

    public static void promedioGeneral(ArrayList<Estudiante> listaEstudiantes) {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No se puede calcular el promedio ya que no hay estudiantes registrados.");
        }

        int notas = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            notas += estudiante.getNotaFinal();
        }

        double promedio = (double) notas / listaEstudiantes.size();
        System.out.println("\n- El promedio general es: " + promedio);
    }

    public static void estudianteMejorNota(ArrayList<Estudiante> listaEstudiantes) {
        int mayor = Integer.MIN_VALUE; 
        String nombreMayor = "";
        String apellidoMayor = "";

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNotaFinal() > mayor) {
                mayor = estudiante.getNotaFinal();
                nombreMayor = estudiante.getNombre();
                apellidoMayor = estudiante.getApellido();
            } 
        }
        System.out.println("\n- El estudiante con mayor nota es: " + nombreMayor + " " + apellidoMayor + ", con un " + mayor);
    }
}