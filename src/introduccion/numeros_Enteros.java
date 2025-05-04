//Implementar un programa que tome tres números enteros y determine cuál es el mayor
package introduccion;
import java.util.Scanner;

public class numeros_Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: "); 
        int num3 = scanner.nextInt();     

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número mayor es: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("El número mayor es: " + num3);
        }
    
        scanner.close();
    }
}