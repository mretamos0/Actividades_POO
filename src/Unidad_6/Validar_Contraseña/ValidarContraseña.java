/*  Valide una contraseña que cumpla con los siguientes criterios:
    1. Mínimo 8 caracteres
    2. Al menos una mayúscula
    3. Un número.
    4. Un carácter especial.
    Si no cumple, lanza una excepción InsecurePasswordException. */
package Unidad_6.Validar_Contraseña;
import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validar = false;

        System.out.println("-----Validar contraseña-----");
        try {
            System.out.print("Ingrese la contraseña:");
            String contraseña = sc.nextLine();

            if (contraseña.length() < 8) {
                throw new InsecurePasswordException("La contraseña debe tener minimo 8 caracteres");
            }

            if (!contraseña.matches(".*[A-Z].*")) {
                throw new InsecurePasswordException("La contraseña debe tener al menos una mayuscula");
            }

            if (!contraseña.matches(".*\\d.*")) {
                throw new InsecurePasswordException("La contraseña debe tener al menos un numero");
            }

            if (!contraseña.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
                throw new InsecurePasswordException("La contraseña debe tener al menos un caracter especial");
            }

            validar = true;
        } catch (InsecurePasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(validar ? "La contraseña esta validada" : "La contraseña no esta validada");
            sc.close();
        }
    }
}