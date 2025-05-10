package Empresalogistica;

public class Main {
    public static void main(String[] args) {

        EnvioPorTierra envio1 = new EnvioPorTierra(100, 50);
        EnvioPorMar envio2 = new EnvioPorMar(200, 30);
        EnvioPorAire envio3 = new EnvioPorAire(150, 20);

        // Envío por tierra
        CalcularEnvio calc1 = new CalcularEnvio(envio1);
        System.out.println("Costo de Envío por Tierra: " + calc1.calcularCosto(envio1.getDistancia(), envio1.getPeso()));

        // Envío por mar
        CalcularEnvio calc2 = new CalcularEnvio(envio2);
        System.out.println("Costo de Envío por Mar: " + calc2.calcularCosto(envio2.getDistancia(), envio2.getPeso()));


        // Envío por aire
        CalcularEnvio calc3 = new CalcularEnvio(envio3);
        System.out.println("Costo de Envío por Aire: " + calc3.calcularCosto(envio3.getDistancia(), envio3.getPeso()));
    }
}

