/*Programe una clase Horario que incluya hora, minuto y segundo. Para dicha clase se requiere:
    a. Constructores por defecto y parametrizado.
    b. Métodos de devolución y modificación.
    c. Método toString.
    d. Métodos sumarHoras, sumarMinutos y sumarSegundos: Que reciben la cantidad de horas, minutos y segundos, respectivamente. Deben devolver el nuevo Horario obtenido */
package Unidad_3.Clases_4.Horario;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void sumarHoras(int cantidad) {
        if (cantidad > 0) {
            hora = (hora + cantidad) % 24;
        }
    }

    public void sumarMinutos(int cantidad) {
        if (cantidad > 0) {
            int m = minuto + cantidad;
            hora = (hora + m / 60) % 24;
            minuto = m % 60;
        }
    }

    public void sumarSegundos(int cantidad) {
        if (cantidad > 0) {
            int s = segundo + cantidad;
            minuto += s / 60;
            segundo = s % 60;
        }

        if (minuto >= 60) {
            hora = (hora + minuto / 60) % 24;
            minuto = minuto % 60;
        }
    }

    @Override
    public String toString() {
        return "{Hora: " + this.hora + ", Minutos: " + this.minuto + ", Segundos: " + this.segundo + "}";
    }


}
