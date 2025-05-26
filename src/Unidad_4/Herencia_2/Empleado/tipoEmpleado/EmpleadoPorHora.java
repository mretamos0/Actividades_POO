package Unidad_4.Herencia_2.Empleado.tipoEmpleado;
import Unidad_4.Herencia_2.Empleado.Empleado;

public class EmpleadoPorHora extends Empleado {
    protected int horasTrabajadas;
    protected double tarifa;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifa) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifa;
    }

    @Override
    public String mostrarRecibo() {
        return super.mostrarRecibo() + ", horas trabajadas: " + horasTrabajadas + ", tarifa: " + tarifa;
    }
}
