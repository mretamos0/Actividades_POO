/*Dada la siguiente clase:
    a. Agregar los constructores por defecto y parametrizado parala clase.
    b. Crear un método toString() en el que se muestre concatenadatoda la información del objeto.
    c. Completar los métodos set y get correspondientes a todos losatributos.
    d. Cree una clase ejecutable que instancie dos empleadossolicitando los datos por teclado y luego, los muestre porpantalla.*/
package Unidad_3.Clases_4.Empleado;

public class Empleado {
    private int codigo;
    private String especialidad;

    public Empleado() {
        this.codigo = 0;
        this.especialidad = "";
    }

    public Empleado(int codigo, String especialidad) {
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    public void setCodigo(int c) {
        this.codigo = c;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEspecialidad(String e) {
        this.especialidad = e;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "{Codigo: " + this.codigo + ", Especialidad: " + this.especialidad + "}"; 
    }
    
}
