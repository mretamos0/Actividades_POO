package Unidad_4.Herencia_3.Receta.tipoReceta;
import Unidad_4.Herencia_3.Receta.Receta;

public class RecetaEnsalada extends Receta{
    public RecetaEnsalada(String nombre) {
        super(nombre);
    }

    @Override
    public String preparar() {
        return "Mezclar lechuga, tomate, pepino y zanahoria rallada con una cuchara de aceite de oliva y limon.";
    }
}