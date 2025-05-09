package Unidad_3.Clases_2.Cuenta_Ahorros;

public class ProbarCuentaDeAhorros {
    public static void main (String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        CuentaDeAhorros.modificarTasaInteres(0.10);
        System.out.println("Interés mensual con tasa del 10%:");
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        
        ahorrador1.mostrarSaldo();
        ahorrador2.mostrarSaldo();
    }
}
