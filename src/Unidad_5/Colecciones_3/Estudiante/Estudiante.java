/*Crea una clase Estudiante con atributos nombre, apellido y notaFinal y permite al usuario ingresar datos de varios estudiantes. 
Muestra la lista ordenada por nota final descendente. Muestra el promedio general y el estudiante con mejor nota */
package Unidad_5.Colecciones_3.Estudiante;

public class Estudiante {
    private String nombre;
    private String apellido;
    private double notaFinal;
    
    public Estudiante(String nombre, String apellido, double notaFinal) {
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
    
    public double getNotaFinal() {
        return notaFinal;
    }
}