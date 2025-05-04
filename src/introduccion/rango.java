//Dado un número entero, verificar si está en el rango de 100 a 200 y si es divisible por 7
package introduccion;
import java.util.Scanner;

public class rango {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese por pantalla un numero entero: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200){
            if (numero % 7 == 0){
            System.out.println("El numero " + numero + " esta en el rango entre 100 y 200 y es divisible por 7");
            } else {
                System.out.println("El numero " + numero + " esta en el rango entre 100 y 200 y No es divisible por 7");
            }
        } else if (numero % 7 == 0) {
            System.out.println("El numero " + numero + " No esta en el rango entre 100 y 200 y es divisible por 7");
        } else{
            System.out.println("El numero " + numero + " No esta en el rango entre 100 y 200 y No es divisible por 715");
        }

        scanner.close();
    }
}
