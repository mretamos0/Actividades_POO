package Unidad_4.Herencia_3.Almacenamiento;
import Unidad_4.Herencia_3.Almacenamiento.tipoAlmacenamiento.*;

public class Backup {
    public static void main(String[] args) {
        Almacenamiento discoDuro = new DiscoDuro();
        Almacenamiento memoriaUSB = new MemoriaUSB();
        Almacenamiento nube = new Nube();

        System.out.println("Disco duro:");
        discoDuro.guardar("12345");

        System.out.println("\nMemoria USB:");
        memoriaUSB.guardar("12345");

        System.out.println("\nNube:");
        nube.guardar("12345");
    }
}