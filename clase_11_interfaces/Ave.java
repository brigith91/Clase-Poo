public class Ave implements Oviparo{
    private String nombre;
    private int edad;
    private String color;
    private int cantidadHuevos;


    public Ave(String nombre, int edad, String color, int cantidadHuevos) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.cantidadHuevos = cantidadHuevos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public void volar(){
        System.out.println("soy un ave de color:"+ getColor()+ "y vuelo");
    }


    @Override
    public void ponerHuevos() {
        System.out.println("La cantidad de huevos que puso fue: "+cantidadHuevos);

    }

    @Override
    public void romperCascaron() {
        System.out.println("Rompi el cascaron");

    }

    @Override
    public String getNombre() {
        return getNombre();
    }

    @Override
    public int getEdad() {
        return getEdad();
    }
}
