/*Crear una clase base llamada Animal con atributos nombre y edad, y un método hacerSonido() que muestre un mensaje genérico.
Luego, crear clases hijas como Perro, Gato y Pajaro que sobrescriban el método hacerSonido() para mostrar sonidos característicos.
Agregar constructores adecuados en cada clase usando super.*/
package Unidad_4.Herencia_2.Animal;

public class Animal {
    private String nombre;
    private int edad;

    public Animal() {
        this.nombre = "Generico";
        this.edad = 0;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido() {
        return "El animal hace un ruido";
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + ", edad: " + edad + ", Sonido: " + hacerSonido();
    }
}
