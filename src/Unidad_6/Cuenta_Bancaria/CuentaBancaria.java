/*Simular una cuenta bancaria.
    Implemente operaciones de retiro, depósito, transferencia y consulta.
    Genere excepciones cuando ocurran los siguientes casos:
        1. Cuando la cuenta bancaria no tenga más saldo disponible.
        2. Cuando el monto de transferencia supere un valor maximo permitido. */
package Unidad_6.Cuenta_Bancaria;
import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el saldo de la cuenta bancaria: ");
            double saldo = sc.nextDouble();
            sc.nextLine();
    
            System.out.print("¿Que operacion quiere realizar? (retiro, deposito, transferencia, consulta): ");
            String operacion = sc.nextLine();
            operacion = operacion.toLowerCase();
    
            switch (operacion) {
                case "retiro":
                    try {
                        System.out.print("¿Cuanto quiere retirar? ");
                        double retiro = sc.nextDouble();
                        if (retiro > saldo) {
                            throw new IllegalArgumentException("El retiro no puede ser mayor al saldo de la cuenta bancaria");
                        }
                        saldo -= retiro;
                        System.out.println("Retiro realizado, saldo: " + saldo);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                
                case "deposito": 
                    System.out.print("¿Cuanto va a depositar? ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito realizado, saldo: " + saldo);
                    break;
                case "transferencia":
                    try {
                        System.out.println("¿Cuanto va a transferir (maximo $1000): ");
                        double transferencia = sc.nextDouble();
                        if (transferencia > 1000) {
                            throw new IllegalArgumentException("La transferencia no puede superar los $1000");
                        } 
                        if (transferencia > saldo) {
                            throw new IllegalArgumentException("No tiene saldo suficiente para esta transferencia.");
                        }
                        saldo -= transferencia;
                        System.out.println("Transferencia realizada, saldo: " + saldo);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                
                case "consulta":
                    System.out.println("El saldo es: " + saldo);
                    break;
                
                default:
                    System.out.println("Error: Ingreso inválido: " + operacion);
                    break;
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}