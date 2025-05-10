public class  Tigre extends Felino {
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

    @Override
    public int cantidadCrias(int numCrias) {
        return numCrias;
    }

    @Override
    public void amamantar() {
        System.out.println( "La leona esta amamantando" + getCrias()+ "crias" );
    }

    @Override
    public void parir() {}

    // Metodo específico para Tigre
    public void rugir() {
        System.out.println("El tigre está rugiendo.");
    }
}
