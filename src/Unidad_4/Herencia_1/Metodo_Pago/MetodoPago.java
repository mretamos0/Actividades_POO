/* Crear una clase abstracta llamada MetodoPago que contenga un atributo montoBase (double), un método constructor y un método abstracto calcularMontoFinal() que retorne un double.
Crear tres subclases concretas que extiendan MetodoPago:
    - PagoConTarjetaCredito: Aplica un recargo del 10% sobre el monto base.
    - PagoConDebito: No aplica recargo ni descuento.
    - PagoConTransferencia: Aplica un descuento del 5%.
Crear una clase UsarMetodosPago en la que se tienen que crear 3 instancias de cada método de pago y se muestren por pantalla los montos finales calculados con cada método. */

package Unidad_4.Herencia_1.Metodo_Pago;

public abstract class MetodoPago {
    protected double montoBase;

    public MetodoPago(double montoBase) {
        this.montoBase = montoBase;
    }
    
    public abstract double calcularMontoFinal();
}








