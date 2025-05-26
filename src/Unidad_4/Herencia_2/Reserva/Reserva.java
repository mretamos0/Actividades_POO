/*Crear una clase base Reserva con atributos codigoReserva, destino, precioBase, y un método calcularPrecioFinal().
Luego, crear:
    - ReservaNacional: aplica un 10% de descuento.
    - ReservaInternacional: aplica un 35% de recargo por impuestos.
Cada subclase debe sobrescribir calcularPrecioFinal() y tener un método mostrarResumen() que llame a métodos de la clase base con super.*/
package Unidad_4.Herencia_2.Reserva;

public class Reserva {
    protected int codigoReserva;
    protected String destino;
    protected double precioBase;
    
    public Reserva(int codigoReserva, String destino, double precioBase) {
        this.codigoReserva = codigoReserva;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase;
    }

    public String mostrarResumen() {
        return "Codigo de reserva: " + codigoReserva + ", destino: " + destino + ", precio base: " + precioBase + "precio final: $" + calcularPrecioFinal();
    }
}
