public class SistemaDeGestion {
    // Atributos
    private String nombre;
    private String codigo;
    private int cantidadDeEstudiantes;
    private int cupo;
    private boolean activo;

    // Constructor
    public SistemaDeGestion(String nombre, String codigo, int cantidadDeEstudiantes, int cupo, boolean activo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDeEstudiantes = cantidadDeEstudiantes;
        this.cupo = cupo;
        this.activo = activo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeEstudiantes() {
        return cantidadDeEstudiantes;
    }

    public void setCantidadDeEstudiantes(int cantidadDeEstudiantes) {
        this.cantidadDeEstudiantes = cantidadDeEstudiantes;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos
    public boolean verificarCupoMaximo() {
        return cantidadDeEstudiantes < cupo;
    }

    public boolean verificacionEstadoDeCurso() {
        if (this.cantidadDeEstudiantes == 0) {
            System.out.println("Curso inactivo");
            return activo = false;

        } else {
            System.out.println("Curso activo");
            return activo = true;


        }
    }
}

