/*Crea una clase Estudiante con atributos nombre, apellido y notaFinal y permite al usuario ingresar datos de varios estudiantes. 
Muestra la lista ordenada por nota final descendente. Muestra el promedio general y el estudiante con mejor nota */
package Unidad_5.Colecciones_3.Estudiante;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int notaFinal;
    
    public Estudiante(String nombre, String apellido, int notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "(nombre: " + nombre + ", apellido: " + apellido + ", notaFinal: " + notaFinal + ")";
    }
}