public class VideoJuego {
    // Atributos
    private String titulo;
    private String genero;
    private int anioDeLanzamiento;
    private double calificacion;
    private boolean disponibilidadDePrestamo;

    // Constructor
    public VideoJuego(String titulo, String genero, int anioDeLanzamiento, double calificacion, boolean disponibilidadDePrestamo) {
        this.titulo = titulo;
        this.genero = genero;
        this.anioDeLanzamiento = anioDeLanzamiento;
        this.calificacion = calificacion;
        this.disponibilidadDePrestamo = disponibilidadDePrestamo;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isDisponibilidadDePrestamo() {
        return disponibilidadDePrestamo;
    }

    public void setDisponibilidadDePrestamo(boolean disponibilidadDePrestamo) {
        this.disponibilidadDePrestamo = disponibilidadDePrestamo;
    }

    // Métodos
    public int consultarAntiguedad(int anioActual) {
        return anioActual - this.anioDeLanzamiento;
    }

    public boolean disponibilidad() {
        if (this.calificacion > 5) {
            System.out.println(" La calificacion es mayor a 5 ,el video juego  esta disponible");
            return this.disponibilidadDePrestamo = false;
        }else {
            System.out.println(" La calificacion es menor a lo requerido, El juego no esta disponible");
            return this.disponibilidadDePrestamo = true;
        }

    }
}

