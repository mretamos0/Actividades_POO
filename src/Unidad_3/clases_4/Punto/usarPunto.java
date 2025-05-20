package Unidad_3.Clases_4.Punto;

public class usarPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.setX(5);
        p1.setY(6);

        Punto p2 = new Punto(2, 0);

        System.out.println("puntos:\nPunto 1: " + p1.toString() + "\nPunto 2: " + p2.toString());

        p1.moverHorizontalmente(-2);
        p1.moverVerticalmente(2);

        p2.moverHorizontalmente(-2);
        p2.moverVerticalmente(0);

        System.out.println("\npuntos modificados:\nPunto 1: " + p1.toString() + "\nPunto 2: " + p2.toString());
    }
}
