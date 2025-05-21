package Unidad_4.Herencia_1.Metodo_Pago.tipoPago;
import Unidad_4.Herencia_1.Metodo_Pago.MetodoPago;

public class pagoConDebito extends MetodoPago {
    public pagoConDebito(double montoBase) {
        super(montoBase);
    }

    public double calcularMontoFinal() {
        return montoBase;
    }
}
