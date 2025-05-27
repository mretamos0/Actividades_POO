/*Crear una interfaz Almacenamiento con el método: void guardar(String datos). 
Implementarla en DiscoDuro, MemoriaUSB y Nube. Cada clase simula guardar datos mostrando un mensaje. 
En una clase Backup, crear una lista de objetos Almacenamiento y recorrerla llamando a guardar(). */
package Unidad_4.Herencia_3.Almacenamiento;

public interface Almacenamiento {
    void guardar(String datos); 
}