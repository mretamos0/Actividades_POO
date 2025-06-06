/*Crear una aplicación que función como una cola de atención de clientes. Crear una clase Cliente con nombre y motivo e implementar las siguientes funcionalidades:
a. Agregar cliente al final.
b. Atender (eliminar el primero).
c. Ver lista de espera.
d. Consultar cuántos clientes quedan.
e. Muestra cómo cambia la cola después de cada operación. */
package Unidad_5.Colecciones_3.Cliente;

public class Cliente {
    private String nombre;
    private String motivo;

    public Cliente(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }

    public String listaEspera() {
        return "(Nombre: " + nombre + ", motivo: " + motivo + ")";
    }
}