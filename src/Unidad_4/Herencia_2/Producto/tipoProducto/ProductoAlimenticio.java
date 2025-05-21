package Unidad_4.Herencia_2.Producto.tipoProducto;
import Unidad_4.Herencia_2.Producto.Producto;

public class ProductoAlimenticio extends Producto{
    private String fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Vencimiento: " + fechaVencimiento;
    }
}
