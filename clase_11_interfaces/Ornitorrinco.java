public class Ornitorrinco implements Mamifero, Oviparo {

    private String nombre;
    private int edad;
    private int crias;

    public Ornitorrinco(String nombre, int edad, int crias) {
        this.nombre = nombre;
        this.edad = edad;
        this.crias = crias;
    }

    // Métodos de Animal
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    // Métodos de Mamifero
    @Override
    public int cantidadCrias() {
        return crias;
    }

    @Override
    public void amamantar() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    @Override
    public void parir() {
        System.out.println("Aunque es mamífero, el ornitorrinco no pare: pone huevos.");
    }

    // Métodos de Oviparo
    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }

    @Override
    public void romperCascaron() {
        System.out.println("Las crías del ornitorrinco rompen el cascarón para nacer.");
    }
}

