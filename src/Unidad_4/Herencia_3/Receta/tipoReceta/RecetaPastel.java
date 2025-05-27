package Unidad_4.Herencia_3.Receta.tipoReceta;
import Unidad_4.Herencia_3.Receta.Receta;

public class RecetaPastel extends Receta{
    public RecetaPastel(String nombre) {
        super(nombre);
    }

    @Override
    public String preparar() {
        return "Batir huevos, azucar, harina y manteca. Vertil la mezcla en un molde y hornea hasta que este dorado.";
    }
}