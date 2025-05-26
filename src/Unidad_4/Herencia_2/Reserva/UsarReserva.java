package Unidad_4.Herencia_2.Reserva;

import Unidad_4.Herencia_2.Reserva.tipoReserva.ReservaInternacional;
import Unidad_4.Herencia_2.Reserva.tipoReserva.ReservaNacional;

public class UsarReserva {
    public static void main(String[] args) {
        Reserva r1 = new ReservaNacional(12345, "Cordoba", 500000);
        Reserva r2 = new ReservaInternacional(23456, "Canada", 1500000);

        System.out.println("Reserva nacional: (" + r1.mostrarResumen() + ")");
        System.out.println("Reserva internacional: (" + r2.mostrarResumen() + ")");
    }
}