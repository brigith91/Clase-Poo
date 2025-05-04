public abstract class Canino implements Mamifero {
    private String nombre;
    private int edad;
    private int crias;

    public Canino(String nombre, int edad, int crias) {
        this.nombre = nombre;
        this.edad = edad;
        this.crias = crias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int cantidadCrias() {
        return crias;
    }

    public void parir() {
        System.out.println(nombre + " (canino) ha parido.");
    }

    public void amamantar() {
        System.out.println(nombre + " (canino) está amamantando.");
    }
}

