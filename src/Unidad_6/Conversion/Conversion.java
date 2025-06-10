/*  Cree una clase que reciba un string que contenga un valor numerico y conviértelos a Integer.
    Captura y maneje las excepciones si el formato no es válido */
package Unidad_6.Conversion;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        try {
            System.out.print("Ingrese un valor numerico: ");
            String valor = sc.nextLine();
            valor = valor.replaceAll(" ", "");

            if (!valor.matches("\\d+")) {
                throw new IllegalArgumentException("El valor numerico solo puede contener numeros");
            }
            int numero = Integer.parseInt(valor);
            valido = true;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("Error: " + e.getMessage());
        } finally {
            System.out.println(valido ? "El numero es valido" : "El numero es invalido");
            sc.close();
        }
    }    
}