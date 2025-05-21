package Unidad_4.Herencia_2.Factura.tipoFactura;
import Unidad_4.Herencia_2.Factura.Factura;

public class FacturacionConIVA extends Factura{
    public FacturacionConIVA(int numero, String fecha, double montoBase) {
        super(numero, fecha, montoBase);
    }

    public double calcularTotal() {
        return getMontoBase() * 1.21;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", monto total: " +  calcularTotal();
    } 
}