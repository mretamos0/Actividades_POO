/* Dada la siguiente clase:
Usuario
- apellido : String
- nombre : String
- documento : int
- nombreusuario : String
- contraseña : String

a) Se solicita construir la clase Usuario en Java con dos constructores, uno por defecto y 
el otro parametrizado y los métodos de devolución y modificación correspondientes. 
Crear la clase UsarUsuario donde se definan dos instancias usando cada uno de los constructores creados para la clase

b) Cree cinco instancias de la clase Usuario, cargue sus atributos por teclado y colóquelos en un arreglo.*/
package Unidad_3.Usuario;

public class Usuario {
    private String apellido;
    private String nombre;
    private int documento;
    private String nombreusuario;
    private String contraseña;
    
    public Usuario() {
        this.apellido = "";
        this.nombre = "";
        this.documento = 0;
        this.nombreusuario = "";
        this.contraseña = "";
    }

    public Usuario(String apellido, String nombre, int documento, String nombreusuario, String contraseña) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "{Apellido: " + this.apellido + ", Nombre: " + this.nombre + ", Documento: " + this.documento + ", Nombre de usuario: " + this.nombreusuario + ", Contraseña: " + this.contraseña + "}";
    }
}

