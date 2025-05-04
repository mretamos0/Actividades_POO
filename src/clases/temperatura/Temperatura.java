/*Crear una clase llamada Temperatura. Utilizar una variable static llamada escala para almacenar la unidad de temperatura (Celsius o Fahrenheit) que se usará por defecto
Cada objeto de la clase debe tener un atributo valor para almacenar la temperatura

- Métodos:
    Set y get correspondientes 
    convertirAFahrenheit(): Convierte y devuelve la temperatura en Fahrenheit
    convertirACelsius (): Convier te y devuelve la temperatura en Celsius 
    static cambiarEscala(String nuevaEscala): Cambia la escala global

Crear un programa UsarTemperatura que cree dos objetos Temperatura, uno con 30°C y otro con 86°F
Utilizar los métodos para convertir las temperaturas según la escala actual (es decir, si el objeto está en Celsius debe devolver la conversión a Fahrenheit y a la inversa),
y cambie la escala para ver los efectos 

Fórmula de conversión:
    Grados Fahrenheit = (grados centígrados × 9/5) +32
    Grados Celsius = (grados Fahrenheit - 32) x 5/9 */
package clases.temperatura;

public class Temperatura {
    private static String escala;
    private double valor;

    public Temperatura() {
        this.valor = 0;
    }

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static String getEscala() {
        return escala;
    }

    public static void cambiarEscala(String escalaNueva) {
        if (escalaNueva.equalsIgnoreCase("celsius") || escalaNueva.equalsIgnoreCase("fahrenheit")) {
            escala = escalaNueva;
        }
    }

    public double convertirAFahrenheit() {
        if (escala == "celsius"){
            return (valor * 9/5) + 32;
        }
        return valor;
    }

    public double convertirACelsius() {
        if (escala == "fahrenheit") {
            return (valor - 32) * 5/9;
        }
        return valor;
    }
}
