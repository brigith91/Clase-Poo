public class Leon extends Felino {
    private String raza;

    public Leon(String nombre, int edad, int cantidadCrias, String raza) {
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

    @Override
    public void amamantar() {
        System.out.println( "La leona esta amamantando" + getCrias()+ "crias" );
    }

    @Override
    public int cantidadCrias(int numCrias) {
        return numCrias;
    }

    @Override
    public void parir() {}

    // Metodo específico para León
    public void rugir() {
        System.out.println("¡El león está rugiendo!");
    }
}


