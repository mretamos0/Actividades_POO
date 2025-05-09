package Unidad_3.Clases_3.Contador_Global;

public class usarContadorGlobal {
    public static void main(String[] args) {
        ContadorGlobal c1 = new ContadorGlobal();
        ContadorGlobal c2 = new ContadorGlobal();
        ContadorGlobal c3 = new ContadorGlobal();
        
        c1.incrementar();
        c2.incrementar();
        c3.incrementar();
        
        System.out.println("Cuenta actual: " + ContadorGlobal.obtenerCuenta());

        ContadorGlobal.resetear();

        System.out.println("Cuenta después de resetear: " + ContadorGlobal.obtenerCuenta());
    }
}
 