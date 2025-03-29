public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private String estadoVehiculo;
    private boolean stock;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double precio, String estadoVehiculo, boolean stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.estadoVehiculo = estadoVehiculo;
        this.stock = stock;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    // Métodos
    public String verificarEstadoVehiculo() {
        if ( this.estadoVehiculo.equals("nuevo")){
            return "El estado del vehículo es: " + estadoVehiculo;
        }
        else{ return " El estado del vehiculo es usado;";
        }
    }

    public boolean verificacionDisponibilidad() {

        if (anio > 2018){
            System.out.println(" El vehiculo esta disponible");
            return true;
        }
        else{
            System.out.println("El vehiculo no esta disponible");
            return false;

        }

    }
}

