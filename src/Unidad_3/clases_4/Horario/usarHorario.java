package Unidad_3.Clases_4.Horario;

public class usarHorario {
    public static void main(String[] args) {
        Horario h1 = new Horario();
        h1.setHora(23);
        h1.setMinuto(58);
        h1.setSegundo(59);

        Horario h2 = new Horario(23, 55, 59);

        System.out.println("Horarios:\nHorario 1: " + h1.toString() + "\nHorario 2: " + h2.toString());

        h1.sumarSegundos(61);
        System.out.println("\nHorario 1 modificado: " + h1.toString());

        h2.sumarSegundos(1);
        h2.sumarMinutos(4);
        h2.sumarHoras(6);
        System.out.println("\nHorario 2 modificado: " + h2.toString());
    }
}
