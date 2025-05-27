package Unidad_4.Herencia_3.Instrumento_Musical;
import java.util.Scanner;
import Unidad_4.Herencia_3.Instrumento_Musical.tipoInstrumento.Guitarra;
import Unidad_4.Herencia_3.Instrumento_Musical.tipoInstrumento.Piano;

public class Orquesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.print("Ingrese la cantidad de instrumentos: ");
        int n = sc.nextInt();
        sc.nextLine();

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[n];
        
        for (int i = 0; i < instrumentos.length; i++){
            while(true){
                System.out.print("Ingrese el nombre del instrumento N°" + (i+1) + ": ");
                nombre = sc.nextLine();

                if(nombre.equalsIgnoreCase("guitarra")){
                    instrumentos[i] = new Guitarra("Guitarra");
                    break;
                } else if (nombre.equalsIgnoreCase("piano")) {
                    instrumentos[i] = new Piano("piano");
                    break;
                } else {
                    System.out.println("El nombre del instrumento no es valido. Debe ser 'guitarra' o 'piano'. Vuelva a ingresar.");
                }
            } 
        }   

        for (int i = 0; i < instrumentos.length; i++){
            System.out.println("\nInstrumento N°" + (i+1) + ": " + instrumentos[i].nombre);
            instrumentos[i].tocar();
        }
        sc.close();
    }
}