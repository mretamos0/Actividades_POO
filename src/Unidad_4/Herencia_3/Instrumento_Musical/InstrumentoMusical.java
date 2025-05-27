/*Crear una clase abstracta InstrumentoMusical con el método abstracto tocar() y un atributo nombre. Luego:
a. Crear al menos dos clases concretas que extiendan InstrumentoMusical: por ejemplo Guitarra y Piano, implementando el método tocar() con un mensaje apropiado.
b. En una clase de prueba (Orquesta), crear un arreglo o lista de InstrumentoMusical e instanciar distintos instrumentos.
c. Recorrer el arreglo y llamar al método tocar() de cada uno. */
package Unidad_4.Herencia_3.Instrumento_Musical;

public abstract class InstrumentoMusical {
    protected String nombre;

    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();
}