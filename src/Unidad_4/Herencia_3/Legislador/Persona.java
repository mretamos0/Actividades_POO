package Unidad_4.Herencia_3.Legislador;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int documento;

    public Persona(String nombre, String apellido, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }   
}