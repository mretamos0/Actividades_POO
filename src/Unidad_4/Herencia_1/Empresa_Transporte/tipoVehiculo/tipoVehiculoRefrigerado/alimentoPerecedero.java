package Unidad_4.Herencia_1.Empresa_Transporte.tipoVehiculo.tipoVehiculoRefrigerado;

import Unidad_4.Herencia_1.Empresa_Transporte.tipoVehiculo.vehiculoRefrigerado;

public class alimentoPerecedero extends vehiculoRefrigerado{
        private String tipoAlimento;

        public alimentoPerecedero(String patente, int anoFabricacion, double capacidadCarga, double temperatura, String sistema, String tipoAlimento) {
            super(patente, anoFabricacion, capacidadCarga, temperatura, sistema);
            this.tipoAlimento = tipoAlimento;
        }

        @Override
        public void mostrarDatos() {
            System.out.println("{Patente: " + patente + ", Año de fabricacion: " + anoFabricacion + ", Capacidad de carga: " + capacidadCarga + ", Temperatura minima: " + temperaturaMinima + ", Sistema de refrigeracion: " + sistemaRefrigeracion + ", Tipo de alimento: " + tipoAlimento + "}");
        }
    }
