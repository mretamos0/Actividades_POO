package Unidad_3.clases_4.Producto;
import java.util.Scanner;

public class usarProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int p = sc.nextInt();
        sc.nextLine();
        
        Producto productos[] = new Producto[p];
        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto();
            System.out.println("\nProducto N°" + (i+1) + ":");

            System.out.print("Ingrese el codigo de identificador: ");
            productos[i].setCodigo(sc.nextLine());

            System.out.print("Ingrese el sku: ");
            productos[i].setSku(sc.nextLine());

            System.out.print("Ingrese el nombre corto: ");
            productos[i].setNombreCorto(sc.nextLine());

            System.out.print("Ingrese la descripcion: ");
            productos[i].setDescripcion(sc.nextLine());

            System.out.print("Ingrese la marca: ");
            productos[i].setMarca(sc.nextLine());

            System.out.print("Ingrese el rubro: ");
            productos[i].setRubro(sc.nextLine());
        }

        System.out.println("\nProductos registrados:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto N°" + (i+1) + ": " + productos[i].toString());
        }

        sc.close();
    }
}
