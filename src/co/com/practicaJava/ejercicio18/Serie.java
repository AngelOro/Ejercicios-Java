package co.com.practicaJava.ejercicio18;

public class Serie implements Entregable{

    private final static String tituloDefault = "Peaky Blinders";
    private final static Integer numeroTemporadasDefault = 3;
    private final static Boolean entregadoDefault = false;
    private final static String generoDefault = "Crimen";
    private final static String creadorDefault = "Otto Bathurst";

    private String titulo;
    private Integer numeroTemporadas;
    private Boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this(tituloDefault, numeroTemporadasDefault, generoDefault, creadorDefault);
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadasDefault;
        this.genero = generoDefault;
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = entregadoDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a ) {
        Serie serie = (Serie) a;
        if (numeroTemporadas < serie.getNumeroTemporadas()){
            return -1;
        }
        if(numeroTemporadas > serie.getNumeroTemporadas()){
            return 1;
        }
        return 0;
    }


}
