package clases.cuentaBancaria;

public class usarCuentaBancaria {
    public static void main (String[] args) {
        cuentaBancaria cb1 = new cuentaBancaria("4567891230", "Lucía Fernández", 2150.75);
        cuentaBancaria cb2 = new cuentaBancaria("7823410561", "Martín Ríos", 487.30);

        System.out.println("\nCuentas bancarias sin metodos: ");
        cb1.mostrarInformacion();
        cb2.mostrarInformacion();

        cb1.retirar(150.75);
        cb1.depositar(1000);
        cb2.retirar(0.30);
        cb2.retirar(500);
        cb2.depositar(100);
        
        System.out.println("Cuentas bancarias luego de los metodos: ");
        cb1.mostrarInformacion();
        cb2.mostrarInformacion();
    }
}
