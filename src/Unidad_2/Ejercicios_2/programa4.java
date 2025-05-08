/*Desarrollar un programa en Java que permita ingresar por tecladolas notas de N estudiantes 
(el valor de N también lo ingresa el usuario). El programa debe:
    Almacenar las notas en un notas de tipo double. 
    Calcular:
        El promedio general.
        La nota más alta y la más baja.
        La cantidad de estudiantes que aprobaron (nota ≥ 6).
        La cantidad de estudiantes que desaprobaron */
package Unidad_2.Ejercicios_2;
import java.util.Scanner;

public class programa4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int num = sc.nextInt();

        double notas[] = new double[num];
        double suma = 0;
        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int contadorAprobados = 0;
        int contadorDesaprobados = 0;
        
        for (int i=0; i < num; i++){
            do {
                System.out.print("Ingrese la nota del estudiante N°" + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
        
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
        
            } while (notas[i] < 0 || notas[i] > 10);

            suma += notas[i];
            
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];        
            }
    
            if (notas[i] >= 6) {
                contadorAprobados++;
            }else{
                contadorDesaprobados++;
            }
        }
        double promedio = suma / num;

        System.out.println("El promedio general es: " + promedio);
        System.out.println("La nota mas alta es: " + mayor);
        System.out.println("La nota mas baja es: " + menor);
        System.out.println("La cantidad de estudiantes aprobados son: " + contadorAprobados);
        System.out.println("La cantidad de estudiantes desaprobados son: " + contadorDesaprobados);
        sc.close();
    }
}
