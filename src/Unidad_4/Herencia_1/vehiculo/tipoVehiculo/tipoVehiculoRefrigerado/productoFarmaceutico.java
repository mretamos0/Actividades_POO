package Unidad_4.Herencia_1.vehiculo.tipoVehiculo.tipoVehiculoRefrigerado;

import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.vehiculoRefrigerado;

public class productoFarmaceutico extends vehiculoRefrigerado{
        private boolean autorizacionSanitaria;

        public productoFarmaceutico(String patente, int anoFabricacion, double capacidadCarga, double temperatura, String sistema, boolean autorizado) {
            super(patente, anoFabricacion, capacidadCarga, temperatura, sistema);
            this.autorizacionSanitaria = autorizado;
        }

        @Override
        public void mostrarDatos() {
            System.out.println("{Patente: " + patente + ", Año de fabricacion: " + anoFabricacion + ", Capacidad de carga: " + capacidadCarga + ", Temperatura minima: " + temperaturaMinima + ", Sistema de refrigeracion: " + sistemaRefrigeracion + ", Autorizacion sanitaria? " + autorizacionSanitaria + "}");
        }
    }
