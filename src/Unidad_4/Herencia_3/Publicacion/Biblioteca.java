package Unidad_4.Herencia_3.Publicacion;
import Unidad_4.Herencia_3.Publicacion.tipoPublicacion.Libro;
import Unidad_4.Herencia_3.Publicacion.tipoPublicacion.Revista;

public class Biblioteca {
    public static void main(String[] args) {
        Publicacion publicaciones[] = new Publicacion[3];
        
        publicaciones[0] = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        publicaciones[1] = new Revista("National Geographic", "National Geographic Society", "Edición 225 (abril 2025)");
        publicaciones[2] = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);

        System.out.println("Publicaciones:");
        for(int i = 0; i < publicaciones.length; i++) {
            System.out.println("- Publicacion N°" + (i+1) + ": " + "(" + publicaciones[i].obtenerTipo() + ")");
        }
    }
}
