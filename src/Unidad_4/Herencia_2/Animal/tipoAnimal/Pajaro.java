package Unidad_4.Herencia_2.Animal.tipoAnimal;
import Unidad_4.Herencia_2.Animal.Animal;

public class Pajaro extends Animal{
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    public String hacerSonido() {
        return "Pio";
    }
}
