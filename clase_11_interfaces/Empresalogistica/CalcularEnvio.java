package Empresalogistica;

public class CalcularEnvio {
    private Envio metodoEnvio;

    public CalcularEnvio(Envio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }


    // Metodo
    public double calcularCosto(double distancia, double peso) {
        return metodoEnvio.calcularCosto(distancia, peso);
    }
}
