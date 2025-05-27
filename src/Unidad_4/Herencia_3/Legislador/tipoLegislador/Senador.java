package Unidad_4.Herencia_3.Legislador.tipoLegislador;
import Unidad_4.Herencia_3.Legislador.Legislador;

public class Senador extends Legislador{
    private String cargo = "Senador";
    private int duracion = 6;

    public Senador(String nombre, String apellido, int documento, String provinciaQueRepresenta) {
        super(nombre, apellido, documento, provinciaQueRepresenta);
    } 

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Cargo: " + cargo + ", nombre: " + super.nombre + ", apellido: " + super.apellido + ", documento: " + super.documento + ", Provincia que representa: " + super.provinciaQueRepresenta + ", Duracion: " + this.duracion;
    } 
}