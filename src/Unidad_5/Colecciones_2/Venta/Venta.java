/*Crear una clase Venta que contenga los siguientes atributos: producto (Producto), cantidad (entero) y precioUnitario (real). 
Esta clase representará la venta de un producto con su cantidad y precio unitario. 
Producto es una clase que contiene los siguientes atributos: descripción (String), id (entero).
Crear una clase RegistroVentas que contenga un ArrayList para almacenar los objetos Venta.
Agregar los siguientes métodos a la clase RegistroVentas:
    agregarVenta: recibe como parámetro un objeto Venta y lo agrega al ArrayList.
    totalVentas: calcula y devuelve el total de ventas (suma de todos los precios de las ventas).
    ventaMasBarata: encuentra y devuelve la descripción del Producto con la venta más barata realizada. */
package Unidad_5.Colecciones_2.Venta;

public class Venta {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public Venta(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}