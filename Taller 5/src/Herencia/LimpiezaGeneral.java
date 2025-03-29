package Herencia;

public class LimpiezaGeneral extends EmpleadosLimpieza {
    private String nombre;
    private String apellido;
    private int edad;
    private int sueldoMensual;



    public LimpiezaGeneral(String nombre, String apellido, int edad, int sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    @Override
    public int getSueldoMensual() { return sueldoMensual; }

    @Override
    public void setSueldoMensual(int sueldoMensual) { this.sueldoMensual = sueldoMensual; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    // Metodo

    @Override
    public int cobrarSueldo() {
        return super.cobrarSueldo();
    }
}

