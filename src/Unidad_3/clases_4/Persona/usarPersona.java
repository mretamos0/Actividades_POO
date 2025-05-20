package Unidad_3.Clases_4.Persona;
import java.util.Scanner;

public class usarPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona personas[] = new Persona[5];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            System.out.println("Persona N°" + (i+1) + ": ");
            
            System.out.print("Ingrese el documento: ");
            personas[i].setDocumento(sc.nextInt());
            sc.nextLine();

            System.out.print("Ingrese el nombre: ");
            personas[i].setNombre(sc.nextLine());

            System.out.print("Ingrese el apellido: ");
            personas[i].setApellido(sc.nextLine());

            System.out.print("Ingrese el genero: ");
            personas[i].setGenero(sc.next().charAt(0));
        }
        
        System.out.println("\nPersonas: ");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona N°" + (i+1) + ": " + personas[i].toString());
        }

        sc.close();
    }    
}
