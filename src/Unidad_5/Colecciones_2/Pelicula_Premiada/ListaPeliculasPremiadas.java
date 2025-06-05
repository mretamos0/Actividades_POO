/*Crear en Java una clase denominada ListaPeliculasPremiadas que disponga de un atributo ArrayList listaPeliculasPremiadas que contendrá objetos de tipo PeliculaPremiada. 
La clase debe tener un método que permita añadir objetos de tipo PeliculaPremiada a la lista, siempre y cuando ya no se encuentre en ella. 
Un objeto de tipo PeliculaPremiada tendrá como atributos título (String) y premioObtenido (String), y los métodos para obtener y establecer los atributos.
Crear una clase UsoListaPeliculasPremiadas con el método main que inicialice un objeto ListaPeliculasPremiadas y añade manualmente cinco objetos de tipo PeliculaPremiada a la lista. 
Deberá mostrar por pantalla el título de cada película y el premio obtenido. */
package Unidad_5.Colecciones_2.Pelicula_Premiada;
import java.util.ArrayList;

public class ListaPeliculasPremiadas {
    private ArrayList<PeliculaPremiada> listaPeliculasPremiadas;

    public ListaPeliculasPremiadas() {
        listaPeliculasPremiadas = new ArrayList<>();
    }

    public boolean agregarPelicula(PeliculaPremiada nuevaPelicula) {
        if (!listaPeliculasPremiadas.contains(nuevaPelicula)) {
            listaPeliculasPremiadas.add(nuevaPelicula);
            return true;
        } else {
            System.out.println("La pelicula " + nuevaPelicula.getTitulo() + ", ya esta en la lista");
            return false;
        }
    }
    public void mostrarPeliculas() {
        System.out.println("\nPeliculas :");
        for (PeliculaPremiada pelicula : listaPeliculasPremiadas) {
            System.out.println("La pelicula '" + pelicula.getTitulo() + "', tiene como premio '" + pelicula.getPremioObtenido() + "'");
        }
    }

    public boolean existeTitulo(String titulo) {
        for (PeliculaPremiada pelicula : listaPeliculasPremiadas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }
}