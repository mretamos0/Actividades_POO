package Unidad_3.clases_4.Empleado;
import java.util.Scanner;

public class usarEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Empleado empleados[] = new Empleado[2];
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado();
            System.out.println("Empleado N°" + (i+1) + ": ");
            
            System.out.print("Ingrese el codigo: ");
            empleados[i].setCodigo(sc.nextInt());
            sc.nextLine();
            
            System.out.print("Ingrese la especialidad: ");
            empleados[i].setEspecialidad(sc.nextLine());
        }

        System.out.println("\nEmpleados: ");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado N°" + (i+1) + ": " + empleados[i].toString());
        }        
        sc.close();
    }
}
