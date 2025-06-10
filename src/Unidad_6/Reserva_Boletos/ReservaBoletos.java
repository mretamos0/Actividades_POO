/*  Simula un sistema de reserva de boletos, fije un valor máximo de ventas.
    Si no hay boletos disponibles, lanza una excepción. */
package Unidad_6.Reserva_Boletos;
import java.util.Scanner;

public class ReservaBoletos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ventas = 0;
        String opcion = ""; 
        int maxVentas = 0;
    
        System.out.print("Ingrese la cantidad de boletos disponibles: ");
        int cantidad = sc.nextInt();
        
        
        if (cantidad == 0) {
            System.out.println("Error: No hay boletos disponibles para vender");
            sc.close();
            return;
        } else {
            System.out.print("Ingrese el maximo de ventas: ");
            maxVentas = sc.nextInt();
            sc.nextLine();

            System.out.print("¿Desea comprar un boleto? (si/no): ");
            opcion = sc.nextLine();
            
        }

        if (opcion.equalsIgnoreCase("si")) {
            cantidad -= 1;
            ventas ++;
        } else if (opcion.equalsIgnoreCase("no")){
            System.out.println("Saliendo...");
            sc.close();
            return;
        }

        while(ventas < maxVentas) {
            try{ 
                if (cantidad == 0) {
                    throw new IllegalArgumentException("No hay mas boletos disponibles para vender");
                }
                if (ventas == maxVentas) {
                    System.out.println("Se ha alcanzado el maximo de ventas");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.close();
                break;
            }
            
            System.out.print("¿Desea comprar otro boleto? (si/no): ");
            String opcion2 = sc.nextLine();
            
            if (opcion2.equalsIgnoreCase("si")) {
                cantidad -= 1;
                ventas ++;
            } else if (opcion2.equalsIgnoreCase("no")){
                System.out.println("Saliendo...");
                sc.close();
                return;
            }
        } 
        if (ventas == maxVentas) {
            System.out.println("Se ha alcanzado el maximo de ventas");
        }
        sc.close();      
    }    
}