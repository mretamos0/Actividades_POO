/*  Crear una clase Auto que contenga los atributos marca, modelo, velocidadActual y un atributo static llamado limiteVelocidad para todos los autos.

    Métodos:
        - Constructor por defecto y parametrizado.
        - Realizar los métodos set y get correspondientes.
        - acelerar(double kmh): Suma velocidad si no supera el límite.
        - frenar(double kmh): Resta velocidad (no pudiendo quedar en un valor negativo).
        - static cambiarLimiteVelocidad(double nuevoLimite)

    Realizar un programa UsarAutos que cree 2 autos (uno con cada constructor definido), acelerar ambos, cambiar el límite de velocidad, y verificar que no lo puedan superar.
    El límite de velocidad inicial debe ser pasado como parámetro al programa */

package Unidad_3.Autos;

public class Auto {
    private String marca;
    private String modelo;
    private double velocidadActual;
    private static double limiteVelocidad;

    public Auto() {
        this.marca = "";
        this.modelo = "";
        this.velocidadActual = 0;
    }

    public Auto(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    } 

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void acelerar(double kmh) {
        if (velocidadActual + kmh <= limiteVelocidad) {
            velocidadActual += kmh;
        } else {
            velocidadActual = limiteVelocidad;
        }
    }

    public void frenar(double kmh) {
        if (velocidadActual >= kmh) {
            velocidadActual -= kmh;
        }
    }

    public static void cambiarLimiteVelocidad(double nuevoLimite) {
        limiteVelocidad = nuevoLimite;
    }

    @Override
    public String toString() {
        return "{Marca: " + this.marca + ", Modelo: " + this.modelo + ", Velocidad Actual: " + this.velocidadActual + "}";
    }

}
