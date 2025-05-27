package Unidad_4.Herencia_3.Almacenamiento.tipoAlmacenamiento;
import Unidad_4.Herencia_3.Almacenamiento.Almacenamiento;

public class MemoriaUSB implements Almacenamiento{
    @Override
    public void guardar(String datos) {
        System.out.println("se ha guardado los datos: '" + datos + "' en la memoria USB.");
    }
}