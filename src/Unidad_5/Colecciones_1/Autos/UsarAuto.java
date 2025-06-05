package Unidad_5.Colecciones_1.Autos;
import java.util.Scanner;
import java.util.ArrayList;

public class UsarAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Auto> listaAutos = new ArrayList<>();
        String marca, modelo;
        int ano;
        double precioVenta;
        double sumaPrecios = 0;

        System.out.println("-----Ingreso de autos-----");
        System.out.println("(Para salir debe ingresar la marca vacia)");

        do {
            System.out.print("Ingrese la marca: ");
            marca = sc.nextLine(); 

            if (marca.isEmpty()) {
                break;
            }

            System.out.print("Ingrese el modelo: ");
            modelo = sc.nextLine(); 

            System.out.print("Ingrese el ano: ");
            ano = sc.nextInt();
            
            System.out.print("Ingrese el precio de venta: ");
            precioVenta = sc.nextDouble(); 
            sc.nextLine(); 

            Auto nuevoAuto = new Auto(marca, modelo, ano, precioVenta);
            listaAutos.add(nuevoAuto);

            sumaPrecios += precioVenta;

        } while(true);

        System.out.println("Lista de autos: ");
        for (Auto auto : listaAutos) {
            System.out.println(auto);
        }

        double promedio = sumaPrecios / listaAutos.size();
        System.out.println("Promedio de ventas de autos: " + Double.toString(promedio));

        System.out.println("Ingrese el modelo de auto a buscar en la lista: ");
        String busqueda = sc.nextLine();

        if (buscarAuto(listaAutos, busqueda)) {
            System.out.println("El auto con modelo " + busqueda + ", se encuentra en la lista");
        } else {
            System.out.println("El auto con modelo " + busqueda + ", no se encuentra en la lista");
        }
        sc.close();
    }

    public static boolean buscarAuto(ArrayList <Auto> autos, String busqueda) {
        for (Auto auto: autos) {
            if (auto.getModelo().equalsIgnoreCase(busqueda)) {
                return true;
            }
        }
        return false;
    }
}
