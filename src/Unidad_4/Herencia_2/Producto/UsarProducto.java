package Unidad_4.Herencia_2.Producto;
import Unidad_4.Herencia_2.Producto.tipoProducto.ProductoAlimenticio;
import Unidad_4.Herencia_2.Producto.tipoProducto.ProductoElectronico;

public class UsarProducto {
    public static void main(String[] args) {
        ProductoElectronico p1 = new ProductoElectronico("Laptop", 1500.00, 24);
        ProductoAlimenticio p2 = new ProductoAlimenticio("Pan", 2.50, "5 JUN");

        System.out.println(p1.mostrarInformacion());
        System.out.println(p2.mostrarInformacion());
    }
}
