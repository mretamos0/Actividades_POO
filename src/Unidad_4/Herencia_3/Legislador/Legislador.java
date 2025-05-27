/*Declare una clase abstracta Legislador que herede de una clase Persona. 
La clase Legislador debe contener un atributo provinciaQueRepresenta, de tipo String, y otros atributos que considere. Declare un método abstracto getCamaraEnQueTrabaja. 
Cree dos clases concretas que hereden de Legislador: la clase Diputado y la clase Senador, que sobrescriban los métodos abstractos necesarios. 
Cree una clase Legisladores con una lista (arreglo) de legisladores y muestre por pantalla la cámara en que trabajan haciendo uso de polimorfismo. */
package Unidad_4.Herencia_3.Legislador;

public abstract class Legislador extends Persona{
    protected String provinciaQueRepresenta;

    public Legislador(String nombre, String apellido, int documento, String provinciaQueRepresenta) {
        super(nombre, apellido, documento);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    
    public abstract String getCamaraEnQueTrabaja();
}