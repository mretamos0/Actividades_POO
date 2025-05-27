/*Crear una clase abstracta Receta con un método abstracto preparar() y un atributo nombre. Luego:
a. Crear dos clases concretas: RecetaPastel y RecetaEnsalada, cada una implementando el método preparar() detallando los pasos.
b. En una clase Cocina, instanciar distintas recetas y ejecutar su preparación. */
package Unidad_4.Herencia_3.Receta;

public abstract class Receta {
    protected String nombre;
    
    public Receta(String nombre) {
        this.nombre = nombre;
    }

    public abstract String preparar();
}