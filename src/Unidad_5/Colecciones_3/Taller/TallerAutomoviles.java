/*Tenemos un taller de reparación de automóviles y queremos realizar un programa con el que gestionar los automóviles que entran, salen y están en el taller.
Los datos de cada auto que queremos registrar son: propietario, matricula, marca, problema, tiempo de reparación estimado, costo de la reparación y si está reparado.
Las opciones que queremos dar son:
a. Entrada nueva reparación: Se registran todos los datos de los automóviles que se recepcionan y se ingresa al taller.
b. Salida de auto reparado: Se busca el auto en el taller por el nombre de propietario o por matricula. Localizado el automóvil, se lo marca como reparado y se lo entrega al propietario, saliendo del taller.
c. Listado de automóviles: Se listan todos los automóviles en el taller, mostrando todos los datos. */
package Unidad_5.Colecciones_3.Taller;
import java.util.Scanner;
import java.util.ArrayList;

public class TallerAutomoviles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Automovil> listaAutomoviles = new ArrayList<>();

        nuevaReparacion(listaAutomoviles, sc);
        salidaAutoReparado(listaAutomoviles, sc);
        listadoAutomoviles(listaAutomoviles);
        sc.close();
    }

    public static void nuevaReparacion(ArrayList<Automovil> listaAutomoviles, Scanner sc) {
        System.out.println("\n-Nueva reparacion");
        String opcion = "";
        while(true) {
            while(true) {
                System.out.print("¿Desea ingresar un nuevo auto? 'Si'/'No': ");
                opcion = sc.nextLine();

                if (opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Ingreso invalido, debe ser 'Si'/'No'. Vuelva a intentar.");
                }
            }

            if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Saliendo....");
                break;
            }
            System.out.print("Ingrese el propietario: ");
            String propietario = sc.nextLine();

            System.out.print("Ingrese la marca: ");
            String marca = sc.nextLine();

            System.out.print("Ingrese el problema: ");
            String problema = sc.nextLine();

            System.out.print("Ingrese el tiempo de reparacion: ");
            String tiempoReparacion = sc.nextLine();

            System.out.print("Ingrese el costo de reparacion: ");
            double costoReparacion = sc.nextDouble();
            sc.nextLine();

            boolean reparado = false;

            Automovil nuevoAuto = new Automovil(propietario, marca, problema, tiempoReparacion, costoReparacion, reparado);
            listaAutomoviles.add(nuevoAuto);
            System.out.println("Automovil agregado");
        }
    }

    public static void salidaAutoReparado(ArrayList<Automovil> listaAutomoviles, Scanner sc) {
        System.out.println("\n-Salida de auto reparado");
        boolean encontrado = false;

        if (listaAutomoviles.isEmpty()) {
            System.out.println("No hay automoviles en reparacion");
        } else {
            System.out.print("Ingrese el propietario del automovil para buscar: ");
            String propietario = sc.nextLine();

            for(int i = 0; i < listaAutomoviles.size(); i++) {
                Automovil automovil = listaAutomoviles.get(i);
                if(automovil.getPropietario().equalsIgnoreCase(propietario)) {
                    listaAutomoviles.remove(i);
                    automovil.setReparado(true);
                    System.out.println("Auto de " + propietario + " reparado y entregado");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontro un vehiculo con ese propietario");
            }
        }   
    }

    public static void listadoAutomoviles(ArrayList<Automovil> listaAutomoviles) {
        System.out.println("\n-Listado automoviles");
    
        if (listaAutomoviles.isEmpty()) {
            System.out.println("No hay automoviles en reparacion");
        } else {
            for (Automovil auto : listaAutomoviles) {
                System.out.println(auto);
            }
        }
    }
}