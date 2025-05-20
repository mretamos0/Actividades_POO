/*Cree una clase llamada Rectángulo. La clase debe tener los atributos longitud y ancho, cada uno con un valor predeterminado de 1. Se requieren:
    a. Constructor por defecto.
    b. Constructor con parámetros.
    c. Métodos sets y gets. Los métodos de modificación deben verificar que longitud y ancho sean números mayores de 0 y menores de 20.
    d. Métodos para calcular el perímetro y el área del rectángulo.
    e. Un programa para probar la clase Rectángulo, creando al menos dos instancias de dicha clase. */
package Unidad_3.Clases_4.Rectangulo;

public class Rectangulo {
    private int longitud;
    private int ancho;
    
    public Rectangulo() {
        this.longitud = 1;
        this.ancho = 1;
    }

    public Rectangulo(int longitud, int ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public void setLongitud(int longitud) {
        if (longitud < 0 || longitud > 20) {
            this.longitud = 1;
        } else {
            this.longitud = longitud;
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setAncho(int ancho) {
        if (ancho < 0 || ancho > 20) {
            this.ancho = 1;
        } else {
            this.ancho = ancho;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public int perimetro() {
        return 2 * (longitud + ancho);
    }

    public int area() {
        return longitud * ancho;
    }

    public String mostrarDatos() {
        return "{Longitud : " + this.longitud +  ", Ancho: " + this.ancho + "}";
    } 
}
