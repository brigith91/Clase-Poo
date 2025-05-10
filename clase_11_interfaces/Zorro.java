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

    @Override
    public int cantidadCrias(int numCrias) {
        return numCrias;
    }

    @Override
    public void amamantar() {
        System.out.println( "La zorra esta amamantando" + getCrias()+ "crias" );
    }

    @Override
    public void parir() {}

    // Metodo específico para Zorro
    public void cazar() {

        System.out.println("El zorro está cazando.");
    }
}
