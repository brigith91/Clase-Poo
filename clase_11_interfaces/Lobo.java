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

    @Override
    public String getNombre() {
        return super.getNombre();
    }


    @Override
    public int cantidadCrias(int numCrias) {
        return numCrias;
    }

    @Override
    public void amamantar() {
        System.out.println( "La loba esta amamantando" + getCrias()+ "crias" );
    }

    @Override
    public void parir() {}

    // Metodo específico para Lobo
    public void aullar() {
        System.out.println("El lobo está aullando.");
    }
}
