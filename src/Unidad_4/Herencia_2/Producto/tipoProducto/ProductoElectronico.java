package Unidad_4.Herencia_2.Producto.tipoProducto;
import Unidad_4.Herencia_2.Producto.Producto;

public class ProductoElectronico extends Producto{
    private int mesesGarantia;

    public ProductoElectronico(String nombre, double precio, int mesesGarantia) {
        super(nombre, precio);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", garantia: " + mesesGarantia + " meses";
    }
}
