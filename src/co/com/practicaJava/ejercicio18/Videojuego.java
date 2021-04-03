package co.com.practicaJava.ejercicio18;

public class Videojuego implements Entregable{

    private final static String tituloDefault = "GTA V";
    private final static Integer horasEstimadasDefault = 10;
    private final static Boolean entregadoDefault = false;
    private final static String generoDefault = "Acción-Aventura";
    private final static String companiaDefault = "Rockstar";

    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this(tituloDefault, horasEstimadasDefault, generoDefault, companiaDefault);
        this.entregado = entregadoDefault;
    }

    public Videojuego(String titulo, String creador) {
        this(titulo, horasEstimadasDefault, generoDefault, creador);
        this.entregado = entregadoDefault;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = entregadoDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
    public int compareTo(Object a) {
        Videojuego videojuego = (Videojuego) a;
        if (horasEstimadas < videojuego.getHorasEstimadas()){
            return -1;
        }
        if(horasEstimadas > videojuego.getHorasEstimadas()){
            return 1;
        }
        return 0;
    }


}
