/*Crear una clase base Factura con atributos como numero, fecha, y montoBase. Incluir un método calcularTotal() que devuelva el monto base.
Luego, crear dos clases hijas:
    - FacturaConIVA, que sobrescriba calcularTotal() para sumar el 21% de IVA.
    - FacturaExenta, que sobrescriba calcularTotal() pero mantenga solo el monto base.
Crear un método en cada clase que muestre todos los datos de la factura. Usar super para reutilizar la lógica común.*/
package Unidad_4.Herencia_2.Factura;

public class Factura {
    private int numero;
    private String fecha;
    private double montoBase;

    public Factura(int numero, String fecha, double montoBase) {
        this.numero = numero;
        this.fecha = fecha;
        this.montoBase = montoBase;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public double calcularTotal() {
        return montoBase;
    }

    public String mostrarDatos() {
        return "numero: " + numero + ", fecha: " + fecha;
    }
}