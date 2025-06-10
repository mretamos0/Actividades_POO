/*  Implemente una clase que permita manipular el CUIL de una persona.
    En el método que valide si un CUIL es correcto o no como un resultado booleano, el resto de los casos considérenlos como excepciones.
    Realice la prueba de varios casos y de tratamiento a las excepciones que se generen. */
package Unidad_6.Cuil;
import java.util.Scanner;

public class Cuil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validar = false;
        try {
            System.out.print("Ingrese su numero de CUIL: ");
            long cuil = sc.nextLong();
            String numero = Long.toString(cuil);
            
            if (numero.length() != 11 || numero == null) {
                if (numero.length() != 11) {
                    throw new IllegalArgumentException("El cuil debe tener 11 digitos");
                } else {
                    throw new IllegalArgumentException("El cuil no puede ser nulo");
                }
            }

            validar = true;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("¿El cuil es valido? " + validar);
            sc.close();
        }
    }
}