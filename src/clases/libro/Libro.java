/*Crear una clase Libro con los atributos privados titulo (String), autor (String) y paginas (int)
con las siguientes características:

a) Un constructor por defecto que inicialice titulo y autor con "Desconocido" y paginas en 0.

b) Un constructor parametrizado que reciba el titulo, el autor y el número de paginas como argumentos y los asigne. 
Realizar una validación básica para que el número de paginas no sea negativo. Si lo es, asignar 0.

c) Crear los métodos set y get para cada atributo. Incluir validación en el setPaginas para que el valor no sea negativo (similar al constructor parametrizado).

d) Crear un método esLibroExtenso() que devuelva true si el libro tiene más de 300 páginas y false en caso contrario.

e) Crear una clase UsarLibro donde se instancien tres objetos Libro:
    Uno utilizando el constructor por defecto y luego se asignen valores usando los métodos set, incluyendo un intento de asignar un número de páginas negativo.
    Otro utilizando el constructor parametrizado con valores válidos.
    Un tercero utilizando el constructor parametrizado con un número de páginas negativo para observar la validación.

f) Mostrar la información de cada libro (título, autor, páginas) y si es considerado un libro extenso utilizando el método esLibroExtenso(). */
package clases.libro;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (paginas < 0) {
            this.paginas = 0;
        } else {
            this.paginas = paginas;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        if (paginas < 0) {
            this.paginas = 0;
        } else {
            this.paginas = paginas;
        }
    }

    public boolean esLibroExtenso() {
        return this.paginas > 300;
    }

    @Override
    public String toString() {
        return "{Titulo: " + this.titulo + ", Autor: " + this.autor + ", Paginas: " + this.paginas + "}";
    }

}