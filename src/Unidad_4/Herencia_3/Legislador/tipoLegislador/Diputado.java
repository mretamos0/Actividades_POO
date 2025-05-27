package Unidad_4.Herencia_3.Legislador.tipoLegislador;
import Unidad_4.Herencia_3.Legislador.Legislador;

public class Diputado extends Legislador{
    private String cargo = "Diputado";
    private int duracion = 4;

    public Diputado(String nombre, String apellido, int documento, String provinciaQueRepresenta) {
        super(nombre, apellido, documento, provinciaQueRepresenta);
    } 

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Cargo: " + cargo + ", Nombre: " + super.nombre + ", apellido: " + super.apellido + ", documento: " + super.documento + ", Provincia que representa: " + super.provinciaQueRepresenta + ", Duracion: " + this.duracion;
    } 
}