package Unidad_5.Colecciones_2.Venta;

public class Producto {
    private String descripcion;
    private int id;
    
    public Producto(String descripcion, int id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }
}