package Unidad_5.Colecciones_3.Banderas;
import java.util.Scanner;
import java.util.ArrayList;

public class UsarBandera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bandera> listaBanderas = new ArrayList<>();

        agregarBandera(listaBanderas, sc);
        identificarColor(listaBanderas, sc);
        sc.close();
    }   

    public static void agregarBandera(ArrayList<Bandera> listaBanderas, Scanner sc) {
        ArrayList<String> colores = new ArrayList<>();
        
        System.out.print("Ingrese la cantidad de banderas para agregar: ");
        int canBanderas = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < canBanderas; i++) {
            System.out.print("Ingrese el pais de la bandera N°" + (i+1) + "/" + canBanderas + ": ");
            String pais = sc.nextLine();

            System.out.print("Ingrese la cantidad de colores que tiene la bandera: ");
            int canColores = sc.nextInt();
            sc.nextLine();

            for(int j = 0; j < canColores; j++) {
                System.out.print("Ingrese el color N°" + (j+1) + "/" + canColores + ": ");
                String color = sc.nextLine();
                colores.add(color.toLowerCase());
            }

            Bandera nuevBandera = new Bandera(pais, colores);
            listaBanderas.add(nuevBandera);
            System.out.println("\nBandera registrada");
        }
    }

    public static void identificarColor(ArrayList<Bandera> listaBanderas, Scanner sc) {
        if (listaBanderas.isEmpty()) {
            System.out.println("No se puede identificar un color ya que no se han agregado banderas");
        }

        System.out.print("\nIngrese el color que desea buscar: ");
        String colorBuscado = sc.nextLine().toLowerCase();

        System.out.println("\nPaíses que tienen el color " + colorBuscado + ":");
        
        boolean encontrado = false;
        for (Bandera bandera : listaBanderas) {
            if (bandera.getColores().contains(colorBuscado)) {
                System.out.println("- " + bandera.getPais());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Ningun pais de la lista tiene el color buscado en la bandera");
        }
    }
}