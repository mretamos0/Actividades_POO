package Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.tipoVehiculoRefrigerado;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.VehiculoRefrigerado;

public class ProductoTecnologico extends VehiculoRefrigerado{
    private String nivelSensibilidad;
    private boolean proteccionHumedad;

    public ProductoTecnologico(String patente, int anoFabricacion, double capacidadCarga, double temperatura, String sistema, String nivel, boolean humedad) {
        super(patente, anoFabricacion, capacidadCarga, temperatura, sistema);
        this.nivelSensibilidad = nivel;
        this.proteccionHumedad = humedad;
    }
                
    @Override
    public void mostrarDatos() {
        System.out.println("{Patente: " + patente + ", Año de fabricacion: " + anoFabricacion + ", Capacidad de carga: " + capacidadCarga + ", Temperatura minima: " + temperaturaMinima + ", Sistema de refrigeracion: " + sistemaRefrigeracion + ", Nivel de sensibilidad: " + nivelSensibilidad + ", Proteccion contra la humedad? " + proteccionHumedad + "}");
    }
}
