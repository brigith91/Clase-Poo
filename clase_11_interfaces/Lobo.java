public class Lobo extends Canino {
    private String tipoManada;

    public Lobo(String nombre, int edad, int cantidadCrias, String tipoManada) {
        super(nombre, edad, cantidadCrias);
        this.tipoManada = tipoManada;
    }

    // Getter y Setter para tipoManada
    public String getTipoManada() {
        return tipoManada;
    }

    public void setTipoManada(String tipoManada) {
        this.tipoManada = tipoManada;
    }

    // Metodo específico para Lobo
    public void aullar() {
        System.out.println("El lobo está aullando.");
    }
}
