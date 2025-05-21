package Unidad_4.Herencia_2.Animal;
import Unidad_4.Herencia_2.Animal.tipoAnimal.Gato;
import Unidad_4.Herencia_2.Animal.tipoAnimal.Pajaro;
import Unidad_4.Herencia_2.Animal.tipoAnimal.Perro;

public class usarAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal perro = new Perro("Firulais", 5);
        Animal gato = new Gato("Misu", 2);
        Animal pajaro = new Pajaro("Piolín", 1);

        System.out.println(a1.mostrarDatos());
        System.out.println(perro.mostrarDatos());
        System.out.println(gato.mostrarDatos());
        System.out.println(pajaro.mostrarDatos());
    }
}
