/*Cree una clase que represente un Punto, para ello vamos a guardar su dos coordenadas (x,y). Esta clase requiere los siguientes métodos:
    a. Constructores por defecto y parametrizado.
    b. Métodos de devolución y modificación.
    c. Método toString.
    d. Mover horizontalmente: Que recibe undesplazamiento y modifica la x.
    e. Mover verticalmente: Que recibe un desplazamientoy modifica la y. */
package Unidad_3.clases_4.Punto;

public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(X: " + this.x + ", Y: " + this.y + ")";
    }

    public void moverHorizontalmente(int desplazamiento) {
        x += desplazamiento;
    }

    public void moverVerticalmente(int desplazamiento) {
        y += desplazamiento;
    }
}
