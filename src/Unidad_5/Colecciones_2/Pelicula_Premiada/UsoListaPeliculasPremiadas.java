package Unidad_5.Colecciones_2.Pelicula_Premiada;
import java.util.Scanner;

public class UsoListaPeliculasPremiadas {
    public static void main(String[] args) {
        ListaPeliculasPremiadas listaPeliculas = new ListaPeliculasPremiadas();
        Scanner sc = new Scanner(System.in);
        String titulo, premio;

        System.out.println("-----Ingreso de 5 películas-----");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el título de la película N°" + (i+1) + "/5" + ": ");
            titulo = sc.nextLine();

            System.out.print("Ingrese el premio obtenido: ");
            premio = sc.nextLine();

            PeliculaPremiada nuevapelicula = new PeliculaPremiada(titulo, premio);
            listaPeliculas.agregarPelicula(nuevapelicula);
        }
        
        agregarPeliculas(listaPeliculas, sc);
        listaPeliculas.mostrarPeliculas();
        sc.close();
    }

    public static void agregarPeliculas(ListaPeliculasPremiadas listaPeliculas, Scanner sc) {
        System.out.println("-----Agregar pelicula-----");
        
        while(true){
            String opcion;
            while(true) {
                System.out.print("¿Quiere agregar otra pelicula? Si/No: ");
                opcion = sc.nextLine();

                if(opcion.equalsIgnoreCase("si") || (opcion.equalsIgnoreCase("no"))) {
                    break;
                }else {
                    System.out.println("Ingreso invalido. Debe ingresar 'Si' o 'No'. Vuelva a intentar.");
                }
            }

            if (opcion.equalsIgnoreCase("no")) {
                System.out.println("-----Saliendo de agregar pelicula-----");
                break;
            }

            System.out.print("Ingrese el titulo de la pelicula: ");
            String titulo = sc.nextLine();

            if(listaPeliculas.existeTitulo(titulo)) {
                System.out.println("La pelicula ya esta en la lista. Ingrese otra.");
                continue;
            }

            System.out.print("Ingrese el premio de la pelicula: ");
            String premio = sc.nextLine();
            
            PeliculaPremiada nuevaPelicula = new PeliculaPremiada(titulo, premio);
            listaPeliculas.agregarPelicula(nuevaPelicula);
        }
    }
}