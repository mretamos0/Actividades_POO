//Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5},
//guardar los valores de este array en otro array distinto pero con los valores invertidos
package Unidad_2.arreglos_1;

public class invertido {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int array_dos[] = new int [array.length];

        for (int i=0; i < array_dos.length; i++) {
            array_dos[i] = array[array.length -1 -i]; //lo que hace aca es restar los indices empezando del ultimo al primero 
                                                        //en la primera iteracion es 5-1-0, luego 5-1-1 y asi hasta que el valor sea 0, que es el primer elemento
        }  
        System.out.print("Array con los valores invertidos: ");
        for (int i = 0; i < array_dos.length; i++) {
            System.out.print(array_dos[i] + " ");
        }
    }
}

