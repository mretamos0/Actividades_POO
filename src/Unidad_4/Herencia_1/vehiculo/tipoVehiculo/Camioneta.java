package Unidad_4.Herencia_1.vehiculo.tipoVehiculo;
import Unidad_4.Herencia_1.vehiculo.Vehiculo;

public class Camioneta extends Vehiculo {
        private String tipoCaja;
        private boolean dobleTraccion;

        public Camioneta(String patente, int anoFabricacion, double capacidadCarga, String tipoCaja, boolean dobleTraccion) {
        super(patente, anoFabricacion, capacidadCarga);
        this.tipoCaja = tipoCaja;
        this.dobleTraccion = dobleTraccion;
        }
        
        @Override
        public void mostrarDatos() {
            System.out.println("{Patente: " + patente + ", Año de fabricacion: " + anoFabricacion + ", Capacidad de carga: " + capacidadCarga + ", Tipo de caja: " + tipoCaja + ", Doble traccion? " + dobleTraccion + "}");
        }
    }