package Unidad_3.Clases_3.Temperatura;

public class usarTemperatura {
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura(30);
        Temperatura t2 = new Temperatura(86);
        
        System.out.println("\nTemp1 en Fahrenheit: " + t1.convertirAFahrenheit());          //t1 esta en F°
        System.out.println("Temp2 en Celsius: " + t2.convertirACelsius());                  //t2 esta en C°
        
        Temperatura.cambiarEscala("fahrenheit");                                //ponemos la escala en F° para asignarsela a t1 (no tiene ninguna escala asignada)
        System.out.println("\nNueva escala: " + Temperatura.getEscala());                   //si llamamos al metodo get podemos ver en que escala esta el programa (en este caso esta en F°)
        System.out.println("Temp1 de Fahrenheit a Celsius: " + t1.convertirACelsius());     //convertimos t1 de F° a C°

        Temperatura.cambiarEscala("celsius");                                   //ponemos la escala en C° para asignarsela a t2 (esta asignada la escala de F° pero yo quiero poner t2 en C°
        System.out.println("\nNueva escala: " + Temperatura.getEscala());                   //si llamamos al metodo get podemos ver en que escala esta el programa (en este caso esta en C°)
        System.out.println("Temp2 de Celcius a Fahrenheit: " + t2.convertirAFahrenheit());  //convertimos t2 de C° a F°

    }
}
