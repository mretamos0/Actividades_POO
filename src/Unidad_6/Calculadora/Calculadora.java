package Unidad_6.Calculadora;
import java.util.Scanner;

class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numero 1: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Ingrese el numero 2: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese la operación que quiere realizar (suma, resta, multiplicacion o division): ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "suma":
                    System.out.println("Resultado: " + suma(num1, num2));
                    break;
                case "resta":
                    System.out.println("Resultado: " + resta(num1, num2));
                    break;
                case "multiplicacion":
                    System.out.println("Resultado: " + multiplicacion(num1, num2));
                    break;
                case "division":
                    try {
                        if (num2 == 0) {
                            sc.close();
                            throw new ArithmeticException("No se puede dividir por cero.");
                        }
                        System.out.println("Resultado: " + division(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    sc.close();
                    throw new IllegalArgumentException("Ingreso invalido: " + opcion);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}