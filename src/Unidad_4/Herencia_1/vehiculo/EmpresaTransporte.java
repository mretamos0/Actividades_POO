package Unidad_4.Herencia_1.Vehiculo;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.Camion;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.Camioneta;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.AlimentoPerecedero;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.ProductoFarmaceutico;
import Unidad_4.Herencia_1.Vehiculo.tipoVehiculo.tipoVehiculoRefrigerado.ProductoTecnologico;

public class EmpresaTransporte {
    public static void main(String[] args) {
        Vehiculo camion = new Camion("ABC123", 2018, 15.0, 4, true);
        Vehiculo camioneta = new Camioneta("DEF456", 2020, 2.5, "cerrada", true);
        Vehiculo perecedero = new AlimentoPerecedero("GHI789", 2021, 8.0, -5, "eléctrico", "carne");
        Vehiculo farmaco = new ProductoFarmaceutico("JKL012", 2019, 5.0, -2, "gas", true);
        Vehiculo tecnologico = new ProductoTecnologico("MNO345", 2022, 3.0, 0, "mixto", "alto", true);

        camion.mostrarDatos();
        camioneta.mostrarDatos();
        perecedero.mostrarDatos();
        farmaco.mostrarDatos();
        tecnologico.mostrarDatos();
    }
}