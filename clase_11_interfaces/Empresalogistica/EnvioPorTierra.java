package Empresalogistica;

public class EnvioPorTierra implements Envio {
    private double distancia;
    private double peso;

    // Constructor
    public EnvioPorTierra(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    // Getter y Setter para distancia
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Getter y Setter para peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // metodo
    @Override
    public double calcularCosto(double distancia, double peso) {
        return distancia * peso * 0.50;
    }
}

