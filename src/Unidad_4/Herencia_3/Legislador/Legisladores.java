package Unidad_4.Herencia_3.Legislador;
import Unidad_4.Herencia_3.Legislador.tipoLegislador.Diputado;
import Unidad_4.Herencia_3.Legislador.tipoLegislador.Senador;

public class Legisladores {
    public static void main(String[] args) {
        Legislador legisladores[] = new Legislador[3];

        legisladores[0] = new Diputado("Juan", "Perez", 30123456, "Buenos Aires");
        legisladores[1] = new Senador("Carlos", "Fernandez", 25987654, "Santa Fe");
        legisladores[2] = new Diputado("Maria", "Gomez", 27654321, "Cordoba");
        
        System.out.println("Legisladores: ");
        for(int i = 0; i < legisladores.length; i++) {
            System.out.println("-Legislador N°" + (i+1) + ": (" + legisladores[i].getCamaraEnQueTrabaja() + ")");
        }
    }
}