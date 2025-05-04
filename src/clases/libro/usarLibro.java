package clases.libro;

public class usarLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.setTitulo("La sombra del viento");
        l1.setAutor("Carlos Ruiz Zafón");
        l1.setPaginas(-14);

        Libro l2 = new Libro("1984", "George Orwell", 328);
        Libro l3 = new Libro("Cien años de soledad", "Gabriel García Márquez", -20);

        System.out.println("Libro 1: " + l1);
        System.out.println("El libro 1 es extenso? " + l1.esLibroExtenso());
        
        System.out.println("\nLibro 2: " + l2);
        System.out.println("El libro 2 es extenso? " + l2.esLibroExtenso());

        System.out.println("\nLibro 3: " + l3);
        System.out.println("El libro 3 es extenso? " + l3.esLibroExtenso());

    }
}
