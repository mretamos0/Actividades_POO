package Unidad_5.Colecciones_3.Taller;

public class Automovil {
    private String propietario;
    private String marca;
    private String problema;
    private String tiempoReparacion;
    private double costoReparacion;
    private boolean reparado;
    
    public Automovil(String propietario, String marca, String problema, String tiempoReparacion, double costoReparacion, boolean reparado) {
        this.propietario = propietario;
        this.marca = marca;
        this.problema = problema;
        this.tiempoReparacion = tiempoReparacion;
        this.costoReparacion = costoReparacion;
        this.reparado = reparado;
    }

    public String getPropietario() {
        return propietario;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }
    
    @Override
    public String toString() {
        return "(propietario: " + propietario + ", marca: " + marca + ", problema: " + problema + ", tiempo de reparacion: " + tiempoReparacion + ", costo de reparacion: " + costoReparacion + ", ¿esta reparado? " + reparado + ")";
    }
}