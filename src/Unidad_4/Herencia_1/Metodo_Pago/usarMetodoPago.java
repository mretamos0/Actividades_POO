package Unidad_4.Herencia_1.Metodo_Pago;
import Unidad_4.Herencia_1.Metodo_Pago.tipoPago.pagoConDebito;
import Unidad_4.Herencia_1.Metodo_Pago.tipoPago.pagoConTarjetaCredito;
import Unidad_4.Herencia_1.Metodo_Pago.tipoPago.pagoConTransferencia;

public class UsarMetodoPago {
    public static void main(String[] args) {
        MetodoPago m1 = new pagoConTarjetaCredito(10);
        MetodoPago m2 = new pagoConDebito(100);
        MetodoPago m3 = new pagoConTransferencia(1000);

        System.out.println("Pago con tarjeta de credito: " + m1.calcularMontoFinal());
        System.out.println("Pago con debito: " + m2.calcularMontoFinal());
        System.out.println("Pago con transferencia: " + m3.calcularMontoFinal());
    }
}
