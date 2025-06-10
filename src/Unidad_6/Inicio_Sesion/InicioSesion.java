/*  Crea una clase que simule un login con usuario y contraseña.
    Si los datos son incorrectos, lanza una excepción personalizada que contemple cada caso. */
package Unidad_6.Inicio_Sesion;
import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-----Registro-----");

        System.out.print("Registre su usuario: ");
        String usuarioRegistro = sc.nextLine();

        System.out.print("Registre su contraseña: ");
        String contraseñaRegistro = sc.nextLine();

        System.out.println("\n-----Ingreso-----");
        boolean ingreso = false;
        try {
            System.out.print("Ingrese su usuario: ");
            String usuarioIngreso = sc.nextLine();
    
            if (!usuarioRegistro.equals(usuarioIngreso)) {
                throw new ExcepcionPersonalizada("Usuario invalido");
            }

            System.out.print("Ingrese su contraseña: ");
            String contraseñaIngreso = sc.nextLine();
        
            if (!contraseñaRegistro.equals(contraseñaIngreso)) {
                throw new ExcepcionPersonalizada("Contraseña invalida");
            }
            ingreso = true; 
 
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(ingreso ? "Se ha iniciado sesion" : "No se pudo iniciar sesion");
            sc.close();
        }
    }
}