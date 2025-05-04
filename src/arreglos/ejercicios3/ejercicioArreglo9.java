/*Solicitar un número entero al usuario por teclado, invertir el número 
y mostrar el resultado */
package arreglos.ejercicios3;
import java.util.Scanner;

public class ejercicioArreglo9 {
    
    public static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;           // agarra el ultimo digito del numero original, porque hace modulo de 10 que da como valor el ultimo digito 
            invertido = invertido * 10 + digito; // y ese ultimo digito lo añade al nuevo valor
            numero = numero / 10;               // quita ese ultimo digito del numero original que ya añadimos al nuevo, para seguir con el anteultimo y asi sucesivamente hasta que el numero original sea 0, que significa que ya se usaron todos sus digitos
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero a invertir: ");
        int numero = sc.nextInt();

        int resultado = ejercicioArreglo9.invertirNumero(numero);
        System.out.print("El numero invertido de " + numero + ", es " + resultado);
        sc.close();
    }
}
