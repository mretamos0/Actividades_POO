package clases.pelicula;

public class usarPelicula {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        p1.setTitulo("Spider-man");
        p1.setGenero("Accion");
        p1.setDirector("Javier Milei");
        p1.setAño(2003);

        Pelicula p2 = new Pelicula("Spider-man 2", "Accion", "Mauricio Macri", 2015);

        System.out.println("Pelicula 1: " + p1);
        System.out.println("Pelicula 2: " + p2);
    }
}