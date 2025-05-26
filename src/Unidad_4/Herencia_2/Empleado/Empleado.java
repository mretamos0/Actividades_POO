/*Diseñar una clase Empleado con los atributos nombre, sueldoBase y un método calcularSueldo() que devuelva el sueldo base.
Luego crear dos subclases:
    - EmpleadoPorHora, que tenga un atributo horasTrabajadas y sobrescriba calcularSueldo() multiplicando las horas por una tarifa.
    - EmpleadoConComision, que tenga un atributo ventasRealizadas y sobrescriba calcularSueldo() sumando una comisión al sueldo base.
Incluir en todas las clases un método mostrarRecibo() que muestre los datos y el sueldo calculado. Usar super para acceder a datos heredados.*/
package Unidad_4.Herencia_2.Empleado;

public class Empleado {
    protected String nombre;
    protected double sueldoBase;
    
    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo() {
        return sueldoBase;
    }

    public String mostrarRecibo() {
        return "Nombre: " + nombre + ", sueldo calculado: $" + calcularSueldo();
    }
}
