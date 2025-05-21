package Unidad_4.Herencia_1.vehiculo;
import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.Camion;
import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.Camioneta;
import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.alimentoPerecedero;
import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.productoFarmaceutico;
import Unidad_4.Herencia_1.vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.productoTecnologico;

public class EmpresaTransporte {
    public static void main(String[] args) {
        Vehiculo camion = new Camion("ABC123", 2018, 15.0, 4, true);
        Vehiculo camioneta = new Camioneta("DEF456", 2020, 2.5, "cerrada", true);
        Vehiculo perecedero = new alimentoPerecedero("GHI789", 2021, 8.0, -5, "eléctrico", "carne");
        Vehiculo farmaco = new productoFarmaceutico("JKL012", 2019, 5.0, -2, "gas", true);
        Vehiculo tecnologico = new productoTecnologico("MNO345", 2022, 3.0, 0, "mixto", "alto", true);

        camion.mostrarDatos();
        camioneta.mostrarDatos();
        perecedero.mostrarDatos();
        farmaco.mostrarDatos();
        tecnologico.mostrarDatos();
    }
}