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

    @Override
    public int cantidadCrias(int numCrias) {
        return numCrias;
    }

    @Override
    public void amamantar() {
        System.out.println( "La perra esta amamantando" + getCrias()+ "crias" );
    }

    @Override
    public void parir() {}

    // Metodo específico para Perro
    public void ladrar() {

        System.out.println("El perro está ladrando.");
    }
}
