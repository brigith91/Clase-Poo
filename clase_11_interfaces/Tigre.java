public class Tigre extends Felino {
    private String color;

    public Tigre(String nombre, int edad, int cantidadCrias, String color) {
        super(nombre, edad, cantidadCrias);
        this.color = color;
    }

    // Getter y Setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodo específico para Tigre
    public void rugir() {
        System.out.println("El tigre está rugiendo.");
    }
}
