package Unidad_4.Herencia_3.Instrumento_Musical.tipoInstrumento;
import Unidad_4.Herencia_3.Instrumento_Musical.InstrumentoMusical;

public class Guitarra extends InstrumentoMusical {
    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra");
    }
}    