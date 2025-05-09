package Unidad_3.clases_4.Rectangulo;

public class usarRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.setLongitud(5);
        r1.setAncho(4);

        Rectangulo r2 = new Rectangulo(4, 8);

        System.out.println("Rectangulo 1: " + r1.mostrarDatos() + "\nPerimetro: " + r1.perimetro() + "\nArea: " + r1.area());
        System.out.println("\nRectangulo 2: " + r2.mostrarDatos() + "\nPerimetro: " + r2.perimetro() + "\nArea: " + r2.area());        
    }
}
