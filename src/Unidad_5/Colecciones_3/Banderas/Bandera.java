/*Realizar un programa en java que permita cargar una lista de banderas de los diferentes países.
Ademas del nombre del país, se necesita indicar los colores que la componen. 
Tambien se requiere identificar de acuerdo a un color en particular, cuales son los países que lo llevan en sus insignias */
package Unidad_5.Colecciones_3.Banderas;
import java.util.ArrayList;

public class Bandera {
    private String pais;
    private ArrayList<String> colores;
    
    public Bandera(String pais, ArrayList<String> colores) {
        this.pais = pais;
        this.colores = colores;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<String> getColores() {
        return colores;
    }

    @Override
    public String toString() {
        return "(pais: " + pais + ", colores: " + colores + ")";
    }
}