package Unidad_5.Colecciones_2.Pelicula_Premiada;

public class PeliculaPremiada {
    private String titulo;
    private String premioObtenido;

    public PeliculaPremiada(String titulo, String premioObtenido) {
        this.titulo = titulo;
        this.premioObtenido = premioObtenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPremioObtenido() {
        return premioObtenido;
    }

    public void setPremioObtenido(String premioObtenido) {
        this.premioObtenido = premioObtenido;
    }
}