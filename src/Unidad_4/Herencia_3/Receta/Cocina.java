package Unidad_4.Herencia_3.Receta;

import Unidad_4.Herencia_3.Receta.tipoReceta.RecetaEnsalada;
import Unidad_4.Herencia_3.Receta.tipoReceta.RecetaPastel;

//En la clase de prueba, agregue un arreglo (no esta en la consigna) para instanciar distintas recetas  

public class Cocina {
    public static void main(String[] args) {
        Receta[] recetas = new Receta[3];

        recetas[1] = new RecetaPastel("Torta de vainilla");
        recetas[2] = new RecetaEnsalada("Ensalada de tomate");
        recetas[3] = new RecetaPastel("Torta de chocolate");

        for(int i = 0; i < recetas.length; i++) {
            System.out.println("Receta N°" + (i+1) + ": " + recetas[i] + "\nPreparacion: " + recetas[i].preparar());
        }
    }
}
