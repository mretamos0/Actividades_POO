package Unidad_3.Clases_3.Autos;

public class usarAutos {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.setMarca("Chevrolet");
        a1.setModelo("Corsa");
        a1.setVelocidadActual(70);

        Auto a2 = new Auto("Audi", "A1", 120);

        Auto.cambiarLimiteVelocidad(180);
        a1.acelerar(100);
        a2.acelerar(81);
        
        System.out.println("Velocidad de los autos luego de acelerar: ");
        System.out.println("Auto 1: " + a1);
        System.out.println("Auto 2: " + a2);
        
        a1.frenar(100);
        a2.frenar(60);
        System.out.println("\nAutos luego de frenar: ");
        System.out.println("Auto 1: " + a1);
        System.out.println("Auto 2: " + a2);        
    }
}
