package clases.usuario;
import java.util.Scanner;

public class usarUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setApellido("Vallerga");
        u1.setNombre("Juan");
        u1.setDocumento(401223123);
        u1.setNombreusuario("juan");
        u1.setContraseña("0123");    

        Usuario u2 = new Usuario("Zanandrea", "Martin", 30123123, "martin", "1230");
        
        System.out.println("Usuarios con constructor por defecto y parametrizado: ");
        System.out.println("Usuario 1: " + u1);
        System.out.println("Usuario 2: " + u2);
        
        Usuario[] usuarios = new Usuario[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario();
            System.out.println("\nIngrese los datos del usuario N°" + (i+1) + ": ");
            
            System.out.print("Apellido: ");
            usuarios[i].setApellido(sc.nextLine());

            System.out.print("Nombre: ");
            usuarios[i].setNombre(sc.nextLine());

            System.out.print("Documento: ");
            usuarios[i].setDocumento(sc.nextInt());
            sc.nextLine();
            
            System.out.print("Nombre de usuario: ");
            usuarios[i].setNombreusuario(sc.nextLine());

            System.out.print("Contraseña: ");
            usuarios[i].setContraseña(sc.nextLine());

        }
        System.out.println("\nUsuarios cargados por teclado: ");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usaurio N°" + (i+1) + ": " + usuarios[i]);
        }

        sc.close();
    }
}
