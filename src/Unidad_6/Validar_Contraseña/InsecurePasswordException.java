package Unidad_6.Validar_Contraseña;

public class InsecurePasswordException extends Exception {
    public InsecurePasswordException(String message) {
        super(message);
    }
}