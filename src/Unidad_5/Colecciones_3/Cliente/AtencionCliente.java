package Unidad_5.Colecciones_3.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class AtencionCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        agregar(listaClientes, sc);
        atender(listaClientes);
        verListaEspera(listaClientes);
        cuantosClientesQuedan(listaClientes);
        
        sc.close();
    }

    public static void agregar(ArrayList<Cliente> listaClientes, Scanner sc) {
        System.out.println("\n- Metodo agregar");
        String opcion = "";
        while(true) {
            while(true) {
                System.out.print("¿Desea agregar un cliente? 'Si'/'No': ");
                opcion = sc.nextLine();

                if(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Ingreso invalido. Debe ser 'Si'/'No'. Vuelva a intentar");
                }
            }
            if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el motivo del cliente: ");
            String motivo = sc.nextLine();

            Cliente nuevoCliente = new Cliente(nombre, motivo);
            listaClientes.add(nuevoCliente);

            System.out.println("Cliente agregado");
        }
        System.out.println("\nClientes luego de agregar: ");
        for(Cliente c : listaClientes) {
            System.out.println("- " + c.listaEspera());
        }
    }

    public static void atender(ArrayList<Cliente> listaClientes) {
        System.out.println("\n- Metodo Atender");
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes en la lista");
        } else {
            Cliente atendido = listaClientes.remove(0); 
            System.out.println("Cliente atendido: " + atendido.listaEspera());
        }
        System.out.println("\nClientes luego de atender: ");
        for(Cliente c : listaClientes) {
            System.out.println("- " + c.listaEspera());
        }
    }

    public static void verListaEspera(ArrayList<Cliente> listaClientes) {
        System.out.println("\n- Metodo lista de espera: ");

        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes en la lista");
        } else {
            System.out.println("Clientes en lista de espera: ");
            for(Cliente c : listaClientes) {
                System.out.println("- " + c.listaEspera());
            }
        }
    }

    public static void cuantosClientesQuedan(ArrayList<Cliente> listaClientes) {
        System.out.println("\n- Metodo clientes que quedan");

        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes en la lista");
        } else {
            int cantidad = listaClientes.size();
            System.out.println("Quedan " + cantidad + " clientes");
        }
    }
}