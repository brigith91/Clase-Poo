public class Puma extends Felino {
    private int velocidad;

    public Puma(String nombre, int edad, int cantidadCrias, int velocidad) {
        super(nombre, edad, cantidadCrias);
        this.velocidad = velocidad;
    }

    // Getter y Setter para velocidad
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Metodo específico para Puma
    public void correr() {
        System.out.println("El puma está corriendo a " + velocidad + " km/h.");
    }
}

