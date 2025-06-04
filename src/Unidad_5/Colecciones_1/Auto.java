/*Crear una clase Autos que contenga: Marca, Modelo, Año, PrecioVenta.
Escribir un programa que lea Autos y los cargue en un ArrayList, hasta que la marca sea vacía, y muestra los datos de autos ingresados (toString con todos los datos correspondientes), y promedio de precios de venta.
Escribir un método que permita obtener si un auto determinado (para identificar, el dato que se tiene es el modelo) se encuentra en el ArrayList. Pasar como parámetro el ArrayList creado y el modelo buscado. */

package Unidad_5.Colecciones_1;

public class Auto {
    private String marca;
    private String modelo;
    private int ano;
    private double precioVenta;

    public Auto(String marca, String modelo, int ano, double precioVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return ano;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String toString() {
        return "[marca : " + marca + ", modelo: " + modelo + ", ano: " + ano + ", Precio de venta: " + precioVenta + "]";
    }
}
