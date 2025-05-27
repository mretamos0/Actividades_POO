package Unidad_4.Herencia_3.Publicacion.tipoPublicacion;
import Unidad_4.Herencia_3.Publicacion.Publicacion;

public class Revista extends Publicacion{
    private String nroEdicion;

    public Revista(String titulo, String autor, String nroEdicion) {
        super(titulo, autor);
        this.nroEdicion = nroEdicion;
    }

    @Override
    public String obtenerTipo() {
        return "Titulo: " + super.titulo + ", autor: " + super.autor + ", Numero de edicion: " + nroEdicion;
    }
}