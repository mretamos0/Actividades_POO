/*Escriba un programa en java que permita registrar los resultados de la carrera de formula 1. 
Ademas del nombre del piloto, la escudería, la posición en la que finalizó, el tiempo empleado para hacer el mismo. 
Mostrar los resultados ordenados por su posición en orden creciente */
package Unidad_5.Colecciones_3.Piloto;

public class Piloto {
    private String nombre;
    private String escuderia;
    private int posicionFinal;
    private double tiempoEmpleado;

    public Piloto(String nombre, String escuderia, int posicionFinal, double tiempoEmpleado) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicionFinal = posicionFinal;
        this.tiempoEmpleado = tiempoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public double getTiempoEmpleado() {
        return tiempoEmpleado;
    }

    public void setTiempoEmpleado(double tiempoEmpleado) {
        this.tiempoEmpleado = tiempoEmpleado;
    }

    @Override
    public String toString() {
        return "- (nombre: " + nombre + ", escuderia: " + escuderia + ", posicionFinal: " + posicionFinal+ ", tiempoEmpleado: " + tiempoEmpleado + ")";
    }    
}