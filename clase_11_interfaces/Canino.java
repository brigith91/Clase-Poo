public abstract class Canino implements Mamifero {
    private String nombre;
    private int edad;
    private int crias;

    public Canino(String nombre, int edad, int crias) {
        this.nombre = nombre;
        this.edad = edad;
        this.crias = crias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCrias() {
        return crias;
    }

    public void setCrias(int crias) {
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
    }

    public abstract int cantidadCrias(int numCrias);

    public void amamantar() {}
}

