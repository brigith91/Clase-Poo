public class SistemaDeSeguimientoEnvios {
    // Atributos
    private String codigo;
    private String direccion;
    private double peso;
    private String estado;
    private boolean firma;

    // Constructor
    public SistemaDeSeguimientoEnvios(String codigo, String direccion, double peso, String estado, boolean firma) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.peso = peso;
        this.estado = estado;
        this.firma = firma;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isFirma() {
        return firma;
    }

    public void setFirma(boolean firma) {
        this.firma = firma;
    }

    // Métodos
    public String consultarEstadoDelPaquete(String estado) {
        if (this.estado.equals("transito")) {
            if (this.firma && firma) {
                return this.estado = "entregado";
            } else {
                return "El estado del paquete no se ha recibido";
            }
        }
        else{ return " El paquete no esta en transito ,por lo tanto no se puede marcar su estado";}
        }
    }


