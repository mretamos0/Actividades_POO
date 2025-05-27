package Unidad_4.Herencia_3.Instrumento_Musical.tipoInstrumento;
import Unidad_4.Herencia_3.Instrumento_Musical.InstrumentoMusical;

public class Piano extends InstrumentoMusical{
    public Piano(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el piano");
    }
}