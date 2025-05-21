package Unidad_4.Herencia_2.Animal.tipoAnimal;
import Unidad_4.Herencia_2.Animal.Animal;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }
}
