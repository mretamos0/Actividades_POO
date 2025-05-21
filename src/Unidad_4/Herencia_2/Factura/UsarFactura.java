package Unidad_4.Herencia_2.Factura;
import Unidad_4.Herencia_2.Factura.tipoFactura.FacturacionConIVA;
import Unidad_4.Herencia_2.Factura.tipoFactura.FacturaExenta;

public class UsarFactura {
    public static void main(String[] args) {
        Factura f1 = new FacturacionConIVA(1, "Marzo 2", 200);
        Factura f2 = new FacturaExenta(2, "Agosto 15", 100);

        System.out.println(f1.mostrarDatos());
        System.out.println(f2.mostrarDatos());
    }
}