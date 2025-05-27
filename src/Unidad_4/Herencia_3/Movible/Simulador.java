package Unidad_4.Herencia_3.Movible;
import Unidad_4.Herencia_3.Movible.tipoMovible.*;

public class Simulador {
    public static void main(String[] args) {
        Movible auto = new Auto();
        Movible barco = new Barco();
        Movible avion = new Avion();

        System.out.println("Auto:");
        auto.mover();
        auto.detener();

        System.out.println("\nBarco:");
        barco.mover();
        barco.detener();

        System.out.println("\nAvion:");
        avion.mover();
        avion.detener();
    }
}