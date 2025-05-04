package Empresalogistica;

public class Main {
    public static void main(String[] args) {

        EnvioPorTierra envio1 = new EnvioPorTierra(100, 50);  // 100 km, 50 kg
        EnvioPorMar envio2 = new EnvioPorMar(200, 30);  // 200 km, 30 kg
        EnvioPorAire envio3 = new EnvioPorAire(150, 20);  // 150 km, 20 kg


        CalcularEnvio calc1 = new CalcularEnvio(envio1);  // Envío por tierra
        System.out.println("Costo de Envío por Tierra: " + calc1.calcularCosto(envio1.getDistancia(), envio1.getPeso()));

        CalcularEnvio calc2 = new CalcularEnvio(envio2);  // Envío por mar
        System.out.println("Costo de Envío por Mar: " + calc2.calcularCosto(envio2.getDistancia(), envio2.getPeso()));

        CalcularEnvio calc3 = new CalcularEnvio(envio3);  // Envío por aire
        System.out.println("Costo de Envío por Aire: " + calc3.calcularCosto(envio3.getDistancia(), envio3.getPeso()));
    }
}

