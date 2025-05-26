package Unidad_4.Herencia_2.Reserva.tipoReserva;
import Unidad_4.Herencia_2.Reserva.Reserva;

public class ReservaInternacional extends Reserva{
    public ReservaInternacional(int codigoReserva, String destino,double precioBase) { 
        super(codigoReserva, destino, precioBase);
    }

    @Override 
    public double calcularPrecioFinal() {
        return precioBase * 1.35;
    }

    @Override
    public String mostrarResumen(){
        return super.mostrarResumen();
    }
}