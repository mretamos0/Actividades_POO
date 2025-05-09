/*Dada la siguiente clase en UML, transcribirla a Java.
Pelicula
-titulo: String
-genero: String
-director: String
-año: int
+ getTitulo(): String
+ setTitulo(t: String )
+ getGenero(): String
+ setGenero(g: String)
+ getDirector(): String
+ setDirector(d: String)
+ getAño(): int
+ setAño(a: int)

a) Agregar los constructores por defecto y parametrizado para la clase Pelicula

b) Crear un método toString() en el que se muestre concatenada toda la información del objeto

c) Crear una clase usarPelicula en la que cree dos objetos Pelicula utilizando cada uno de los constructores creados.
Asignar valores a los atributos utilizando los métodos set al objeto creado con el constructor por defecto.
Mostrar los valores de todos los atributos de los dos objetos.*/
package Unidad_3.Clases_1.Pelicula;

//clase Pelicula
public class Pelicula{
    private String titulo;
    private String genero;
    private String director;
    private int año;
    //constructor por defecto
    public Pelicula(){
        this.titulo = "";
        this.genero = "";
        this.director = "";
        this.año = 0;
    }
    //constructor parametrizado
    public Pelicula(String titulo, String genero, String director, int año) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.año = año;
    }
    //metodos get
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public int getAño() {
        return año;
    }
    //metodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "{Titulo: " + this.titulo + ", Genero: " + this.genero + ", Director: " + this.director + ", Año: " + this.año + "}";
    }
}