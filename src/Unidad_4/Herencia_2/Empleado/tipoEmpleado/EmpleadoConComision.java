package Unidad_4.Herencia_2.Empleado.tipoEmpleado;
import Unidad_4.Herencia_2.Empleado.Empleado;

public class EmpleadoConComision extends Empleado{
    protected int ventasRealizadas;
    protected double comision;

    public EmpleadoConComision(String nombre, double sueldoBase, int ventasRealizadas, double comision) {
        super(nombre, sueldoBase);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (ventasRealizadas * comision); 
    }

    @Override
    public String mostrarRecibo() {
        return super.mostrarRecibo() + ", ventas realizadas: " + ventasRealizadas + ", Comision: " + comision;
    }
}
