/*  Crea una clase Estudiante. Valide que el nombre no esté vacío y la nota esté entre 0 y 10.
    Generar y tratar las excepciones correspondientes. */
package Unidad_6.Registro_Estudiante;
import java.util.Scanner;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean registrado = false;
        try {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
    
            if (nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacio");
            }
    
            System.out.print("Ingrese la nota del estudiante: ");
            int nota = sc.nextInt();
    
            if(nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
            }
            registrado = true;
    
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println(registrado ? "Registro del estudiante realizado" : "No se ha podido registrar el estudiante");
        }
    }
}
