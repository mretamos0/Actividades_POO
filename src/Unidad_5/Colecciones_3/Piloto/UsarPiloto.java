package Unidad_5.Colecciones_3.Piloto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class UsarPiloto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Piloto> listaPilotos = new ArrayList<>();

        registrarPilotos(listaPilotos, sc);
        ordenarPosicionCreciente(listaPilotos);

        sc.close();
    }

    public static void registrarPilotos(ArrayList<Piloto> listaPilotos, Scanner sc) {
        System.out.println("-----Registro pilotos-----");
        String opcion = "";

        while(true) {
            while(true) {
            System.out.print("¿Quiere ingresar un piloto? 'Si'/'No': ");
            opcion = sc.nextLine();

                if (opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Ingreso invalido. Debe ser 'si' o 'no'. Vuelva a intentar");
                }
            }

            if(opcion.equalsIgnoreCase("no")) {
                System.out.println("\nsaliendo...");
                break;
            }

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el escuderia: ");
            String escuderia = sc.nextLine();

            System.out.print("Ingrese la posicion final de carrera: ");
            int posicionFinal = sc.nextInt();

            System.out.print("Ingrese el tiempo empleado: ");
            double tiempoEmpleado = sc.nextDouble();
            sc.nextLine();

            Piloto nuevoPiloto = new Piloto(nombre, escuderia, posicionFinal, tiempoEmpleado);
            listaPilotos.add(nuevoPiloto);
            System.out.println("\nPiloto registrado.");
        }    
    }

    public static void ordenarPosicionCreciente(ArrayList<Piloto> listaPilotos) {
        if (listaPilotos.isEmpty()) {
            System.out.println("No se puede ordenar la lista ya que no hay pilotos registrados. Registre pilotos");
        }
        listaPilotos.sort(Comparator.comparingInt(Piloto::getPosicionFinal));
        // .sort() espera que le diga como ordenar los elementos, por defecto siempre compara de menor a mayor
        // si quisiera de mayor a menor es lo mismo pero agregando .reversed() al final: listaPilotos.sort(Comparator.comparingInt(Piloto::getPosicionFinal).reversed());
        // Comparator compara 2 elementos para decidir cual debe ir por encima del otro, y usa .comparingInt para comparar elementos de valor entero (int)
        // piloto::getPosicionFinal hace referencia a que se compare la posicion final de la clase Piloto

        System.out.println("\n- Lista de pilotos ordenada por posicion en orden creciente: ");
        for(Piloto p : listaPilotos) {
            System.out.println(p);
        }
    }
}