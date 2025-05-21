package Unidad_4.Herencia_1.Metodo_Pago.tipoPago;
import Unidad_4.Herencia_1.Metodo_Pago.MetodoPago;

public class pagoConTransferencia extends MetodoPago {
    public pagoConTransferencia(double montoBase) {
        super(montoBase);
    }

    public double calcularMontoFinal() {
        return montoBase * 0.95;
    }
}
