public abstract class Felino implements Mamifero {
    private String nombre;
    private int edad;
    private int crias;

    public Felino(String nombre, int edad, int crias) {
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
        System.out.println(nombre + " (felino) ha parido.");
    }

    public void amamantar() {
        System.out.println(nombre + " (felino) está amamantando.");
    }
}

