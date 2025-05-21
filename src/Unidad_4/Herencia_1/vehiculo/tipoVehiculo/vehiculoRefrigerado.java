package Unidad_4.Herencia_1.Vehiculo.tipoVehiculo;
import Unidad_4.Herencia_1.Vehiculo.Vehiculo;

public abstract class VehiculoRefrigerado  extends Vehiculo{
        protected double temperaturaMinima; 
        protected String sistemaRefrigeracion;

        public VehiculoRefrigerado(String patente, int anoFabricacion, double capacidadCarga, double temperaturaMinima, String sistemaRefrigeracion) {
            super(patente, anoFabricacion, capacidadCarga);
            this.temperaturaMinima = temperaturaMinima;
            this.sistemaRefrigeracion = sistemaRefrigeracion;


        }
}