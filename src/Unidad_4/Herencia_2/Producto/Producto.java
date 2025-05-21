/*Diseñar una clase Producto con atributos nombre y precio, y un método mostrarInformacion().
Crear clases ProductoElectronico y ProductoAlimenticio que agreguen atributos específicos y sobrescriban mostrarInformacion() para mostrar toda la información.
Asegurarse de usar super para reutilizar el método base. */
package Unidad_4.Herencia_2.Producto;

public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", precio: $" + precio;
    }
}
