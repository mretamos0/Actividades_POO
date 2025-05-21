package Unidad_4.Herencia_1.vehiculo.tipoVehiculo;
import Unidad_4.Herencia_1.vehiculo.Vehiculo;

public class Camion extends Vehiculo{
    private int ejes;
    private boolean remolque;

    public Camion(String patente, int anoFabricacion, double capacidadCarga, int ejes, boolean remolque) {
        super(patente, anoFabricacion, capacidadCarga);
        this.ejes = ejes;
        this.remolque = remolque;
    }
        
    @Override
    public void mostrarDatos() {
        System.out.println("{Patente: " + patente + ", Año de fabricacion: " + anoFabricacion + ", Capacidad de carga: " + capacidadCarga + ", Ejes: " + ejes + ", Tiene remolque? " + remolque + "}");
    }
}