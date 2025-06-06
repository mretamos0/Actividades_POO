/*Crear una clase Estudiante que tenga los atributos nombre (String) y edad (int). Sobre escribir el método toString() para mostrar los datos.
Crear una clase Ejercicio6 que contenga una lista ArrayList<Estudiante>.
Crear un método para cargar el ArrayList con al menos 5 estudiantes.
Crear un método que permita ordenar los elementos alfabéticamente por nombre utilizando Collections.sort() y compareTo().
Crear un método que permita mostrar la lista ordenada. */
package Unidad_5.Colecciones_2.Estudiante;

public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", edad: " + edad;
    }

    @Override
    public int compareTo(Estudiante otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
}