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

    public int getCrias() {
        return crias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCrias(int crias) {
        this.crias = crias;
    }

    @Override
    public void parir() {

    }

    @Override
    public void amamantar() {

    }

    @Override
    public int cantidadCrias(int numCrias) {
        return 0;
    }
}

