public class Perro extends Canino {
    private String raza;

    public Perro(String nombre, int edad, int cantidadCrias, String raza) {
        super(nombre, edad, cantidadCrias);
        this.raza = raza;
    }

    // Getter y Setter para raza
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Metodo específico para Perro
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}
