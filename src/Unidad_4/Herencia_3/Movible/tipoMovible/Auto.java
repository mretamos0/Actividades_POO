package Unidad_4.Herencia_3.Movible.tipoMovible;
import Unidad_4.Herencia_3.Movible.Movible;

public class Auto implements Movible{
    @Override
    public void mover() {
        System.out.println("El auto se mueve");
    }

    @Override
    public void detener() {
        System.out.println("El auto se detiene");
    }
}