package Unidad_4.Herencia_1.Empresa_Transporte.tipoVehiculo;
import Unidad_4.Herencia_1.Empresa_Transporte.Vehiculo;

public abstract class vehiculoRefrigerado  extends Vehiculo{
        protected double temperaturaMinima; 
        protected String sistemaRefrigeracion;

        public vehiculoRefrigerado(String patente, int anoFabricacion, double capacidadCarga, double temperaturaMinima, String sistemaRefrigeracion) {
            super(patente, anoFabricacion, capacidadCarga);
            this.temperaturaMinima = temperaturaMinima;
            this.sistemaRefrigeracion = sistemaRefrigeracion;


        }
}