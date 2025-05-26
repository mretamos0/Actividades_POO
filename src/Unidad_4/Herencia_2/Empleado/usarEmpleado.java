package Unidad_4.Herencia_2.Empleado;

import Unidad_4.Herencia_2.Empleado.tipoEmpleado.EmpleadoConComision;
import Unidad_4.Herencia_2.Empleado.tipoEmpleado.EmpleadoPorHora;

public class usarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoPorHora("Andres", 8, 3000);
        Empleado e2 = new EmpleadoConComision("Carlos", 100, 5, 0.5);
        
        System.out.println("Empleado por hora:\n" + e1.mostrarRecibo());
        System.out.println("");
        System.out.println("Empleado con comision:\n" + e2.mostrarRecibo());
    }
}