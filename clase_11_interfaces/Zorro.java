public class Zorro extends Canino {
    private String habitat;

    public Zorro(String nombre, int edad, int cantidadCrias, String habitat) {
        super(nombre, edad, cantidadCrias);
        this.habitat = habitat;
    }

    // Getter y Setter para habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Metodo específico para Zorro
    public void cazar() {
        System.out.println("El zorro está cazando.");
    }
}
