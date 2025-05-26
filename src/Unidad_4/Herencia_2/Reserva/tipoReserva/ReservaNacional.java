package Unidad_4.Herencia_2.Reserva.tipoReserva;
import Unidad_4.Herencia_2.Reserva.Reserva;

public class ReservaNacional extends Reserva {
    public ReservaNacional(int codigoReserva, String destino,double precioBase) { 
        super(codigoReserva, destino, precioBase);
    }

    @Override 
    public double calcularPrecioFinal() {
        return precioBase * 0.90;
    }

    @Override
    public String mostrarResumen(){
        return super.mostrarResumen();
    }
}