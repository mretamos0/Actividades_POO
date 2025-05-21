/*Una empresa de logística trabaja con tres tipos de vehículos: camiones, camionetas y vehículos refrigerados. 
Todos los vehículos tienen patente, año de fabricación, capacidad de carga (en toneladas). 
Además, los camiones deben tener el número de ejes y si tienen o no remolque. 
Las camionetas deben incluir el tipo de caja (abierta o cerrada) y si poseen doble tracción. 
Los vehículos refrigerados deben indicar la temperatura mínima de operación y el tipo de sistema de refrigeración (eléctrico, gas o mixto). 
A su vez, existen tres tipos de vehículos refrigerados: de alimentos perecederos, que deben especificar el tipo de alimento transportado (carne, lácteos, vegetales), 
de productos farmacéuticos, que deben incluir la autorización sanitaria del ministerio correspondiente, 
de productos tecnológicos sensibles (como chips o baterías) , que deben incluir nivel de sensibilidad (bajo, medio, alto), y si poseen protección contra humedad.
Se solicita diseñar e implementar la jerarquía de clases respetando los principios de la programación orientada a objetos. 
Implementar un método mostrarDatos() en cada clase que imprima todos los atributos. En una clase principal EmpresaTransporte, crear al menos un objeto de cada tipo de vehículo.
Mostrar la información completa de cada vehículo usando el método mostrarDatos(). */
package Unidad_4.Herencia_1.Vehiculo;

public abstract class Vehiculo {
    protected String patente;
    protected int anoFabricacion;
    protected double capacidadCarga;

    public Vehiculo(String patente, int anoFabricacion, double capacidadCarga) {
        this.patente = patente;
        this.anoFabricacion = anoFabricacion;
        this.capacidadCarga = capacidadCarga;
    }
    
    public abstract void mostrarDatos();
}