package Unidad_4.Herencia_1.Metodo_Pago.tipoPago;
import Unidad_4.Herencia_1.Metodo_Pago.MetodoPago;

public class pagoConTarjetaCredito extends MetodoPago {
    public pagoConTarjetaCredito(double montoBase) {
        super(montoBase);
    }

    public double calcularMontoFinal() {
        return montoBase * 1.10;
    }
}
