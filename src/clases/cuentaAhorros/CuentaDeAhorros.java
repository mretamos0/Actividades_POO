/*Cree una clase llamada CuentaDeAhorros. Use una variable static llamada tasaInteresAnual para almacenar la tasa de interés anual para todos los cuentahabientes. 
Cada objeto de la clase debe contener una variable de instancia private llamada saldoAhorros, que indique la cantidad que el ahorrador tiene actualmente en depósito. 

Proporcione el método calcularInteresMensual para calcular el interés mensual, multiplicando el saldoAhorros por la tasaInteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros. 

Proporcione un método static llamado modificarTasaInteres para establecer la tasaInteresAnual en un nuevo valor.

Escriba un programa para probar la clase CuentaDeAhorros. 

Cree dos instancias de objetos CuentaDeAhorros, ahorrador1 y ahorrador2, con saldos de $2000.00 y $3000.00, respectivamente. 

Establezca la tasaInteresAnual en 10%, después calcule el interés mensual e imprima los nuevos saldos para ambos ahorradores. 

Luego establezca la tasaInteresAnual en 12%, calcule el interés del siguiente mes e imprima los nuevos saldos para ambos ahorradores. */
package clases.cuentaAhorros;

public class CuentaDeAhorros {
    private double saldoAhorros;
    private static double tasaInteresAnual;

    public CuentaDeAhorros() {
        this.saldoAhorros = 0;
    }

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    public void calcularInteresMensual() {
        double interesMensual = (saldoAhorros * tasaInteresAnual) / 12;
        this.saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double tasaModificada) {
        tasaInteresAnual = tasaModificada;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de ahorros: " + String.format("%.2f", this.saldoAhorros)); //ese formato de print redonde el salario que es un real a 2 cifras luego de la coma
    }

}
