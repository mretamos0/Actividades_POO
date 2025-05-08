/*Crear una clase llamada CuentaBancaria con los siguientes atributos privados:
-numeroCuenta (String)
-titular (String)
- saldo (double)

a) Implementar los siguientes constructores:
    Un constructor que reciba el número de cuenta y el titular, e inicialice el saldo a 0.
    Un constructor que reciba el número de cuenta, el titular y el saldo inicial.

b) Implementar métodos para:
    depositar(double cantidad): Incrementa el saldo en la cantidad especificada.
    retirar(double cantidad): Decrementa el saldo en la cantidad especificada (asegúrarse de que no quede en negativo).
    getNumeroCuenta(): Devuelve el número de cuenta.
    getTitular(): Devuelve el titular.
    getSaldo(): Devuelve el saldo.
    mostrarInformacion(): Imprime el número de cuenta, el titular y el saldo. */
package Unidad_3.Cuenta_Bancaria;

public class cuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public cuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    public cuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public void depositar(double cantidad) {
        if (cantidad >= 0) {
            this.saldo += cantidad;
        } 
    }

    public void retirar(double cantidad) {
        if (cantidad >= 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        }
    }
        
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo + "\n");
    }
}