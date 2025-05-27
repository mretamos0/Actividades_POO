package Unidad_4.Herencia_3.Movible.tipoMovible;
import Unidad_4.Herencia_3.Movible.Movible;

public class Barco implements Movible{
    @Override
    public void mover() {
        System.out.println("El barco se mueve");
    }

    @Override
    public void detener() {
        System.out.println("El barco se detiene");
    }
}