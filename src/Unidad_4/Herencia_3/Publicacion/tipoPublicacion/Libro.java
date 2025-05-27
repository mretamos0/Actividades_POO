package Unidad_4.Herencia_3.Publicacion.tipoPublicacion;
import Unidad_4.Herencia_3.Publicacion.Publicacion;

public class Libro extends Publicacion{
    private int nroPaginas;

    public Libro(String titulo, String autor, int nroPaginas) {
        super(titulo, autor);
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String obtenerTipo() {
        return "Titulo: " + super.titulo + ", autor: " + super.autor + ", Numero de paginas: " + nroPaginas;
    }
}