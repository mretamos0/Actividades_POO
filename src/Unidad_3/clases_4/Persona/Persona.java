/*Dada la siguiente clase:
    a. Agregar los constructores por defecto y parametrizado parala clase.
    b. Crear un método toString() en el que se muestre concatenada toda la información del objeto.
    c. Completar los métodos set y get correspondientes a todos losatributos.
    d. Cree una clase ejecutable que instancie cinco personas solicitando los datos por teclado, las coloque en un arreglo y luego, las muestre por pantalla. */
package Unidad_3.clases_4.Persona;

public class Persona {
    private int documento;
    private String nombre;
    private String apellido;
    private char genero;

    public Persona() {
        this.documento = 0;
        this.nombre = "";
        this.apellido = "";
        this.genero = ' ';
    }

    public Persona(int documento, String nombre, String apellido, char genero) {
        this.documento = documento; 
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "(Documento: " + this.documento + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Genero: " + this.genero + ")";
    }
}
