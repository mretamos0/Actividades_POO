package Unidad_5.Colecciones_2.Venta;
import java.util.ArrayList;

public class RegistroVentas {
    public static void main(String[] args) {
        ArrayList<Venta> listaVentas = new ArrayList<>();
        Producto p = new Producto("PC Gamer", 1);

        Venta v = new Venta(p, 3, 2000);

        
        agregarVenta(listaVentas, v);
        totalVentas(listaVentas);
        ventaMasBarata(listaVentas); 
    }

    public static void agregarVenta(ArrayList<Venta> listaVentas, Venta v) {
        listaVentas.add(v);
    }

    public static void totalVentas(ArrayList<Venta> listaVentas) {
        double total = 0;

        for(Venta v: listaVentas) {
            total += v.getCantidad() * v.getPrecioUnitario();
        }

        System.out.println("El total de ventas es: " + total);
    }

    public static void ventaMasBarata(ArrayList<Venta> listaVentas) {
        double menor = Double.MAX_VALUE;
        String descripcionBarata = "";
        for (Venta v: listaVentas) {
            if (v.getPrecioUnitario() < menor) {
                menor = v.getPrecioUnitario();
                descripcionBarata = v.getProducto().getDescripcion();
            }
        }
        System.out.println("Descripcion del producto con la venta mas barata: '" + descripcionBarata + "'. Y su precio es de: $" + menor);
    }
}