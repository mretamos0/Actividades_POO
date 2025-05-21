package Unidad_4.Herencia_2.Factura.tipoFactura;
import Unidad_4.Herencia_2.Factura.Factura;

public class FacturaExenta extends Factura{
    public FacturaExenta(int numero, String fecha, double montoBase) {
        super(numero, fecha, montoBase);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", monto total: " + calcularTotal();
    } 
}
