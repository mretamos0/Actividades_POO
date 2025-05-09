/*  Cree una clase llamada Producto que guarde la siguiente información: Código de identificación, SKU, nombre corto, descripción, marca, rubro.
    La clase deberá contener los siguientes métodos:
        a. Constructor por defecto.
        b. Constructor con parámetros.
        c. Métodos sets y gets.
        d. Método toString con la concatenación de los valores de los atributos.
        e. Crear la clase Productos que reciba por parámetro la cantidad de instancias de la clase Producto que se deben crear. 
        Generar un arreglo del tamaño recibido y colocar cada instancia en el arreglo. Los valores de los atributos deben ser solicitados al usuario por teclado. */
package Unidad_3.clases_4.Producto;

public class Producto {
    private String codigo;
    private String sku;
    private String nombreCorto;
    private String descripcion;
    private String marca;
    private String rubro;

    public Producto() {
        this.codigo = "";
        this.sku = "";
        this.nombreCorto = "";
        this.descripcion = "";
        this.marca = "";
        this.rubro = "";
    }

    public Producto(String codigo, String sku, String nombreCorto, String descripcion, String marca, String rubro) {
        this.codigo = codigo;
        this.sku = sku;
        this.nombreCorto = nombreCorto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.rubro = rubro;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    @Override
    public String toString() {
        return "{Codigo de identificacion : " + this.codigo + ", SKU: " + this.sku + ", Nombre corto: " + this.nombreCorto + ", Descripcion: " + this.descripcion + ", Marca: " + this.marca + ", Rubro: " + this.rubro + "}";
    }
}
