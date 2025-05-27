/*Crear una clase abstracta Publicacion con:
    - Atributos: titulo, autor.
    - Método abstracto obtenerTipo().
a. Subclases:
    - Libro (agrega atributo nroPaginas).
    - Revista (agrega atributo numeroEdicion).
b. En una clase Biblioteca, crear una lista de publicaciones y mostrar título, autor y tipo llamando a obtenerTipo(). */
package Unidad_4.Herencia_3.Publicacion;

public abstract class Publicacion {
    protected String titulo;
    protected String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String obtenerTipo();
}