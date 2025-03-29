package Herencia;

public class EmpleadosLimpieza {

    private String nombre;
    private String apellido;
    private int edad;
    private int sueldoMensual;


    public EmpleadosLimpieza(String nombre, String apellido, int edad, int sueldoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldoMensual = sueldoMensual;
    }

    public EmpleadosLimpieza() {
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {this.nombre = nombre; }

    public String getApellido() {return apellido; }

    public void setApellido(String apellido) {this.apellido = apellido; }

    public int getEdad() {return edad; }

    public int getSueldoMensual() {return sueldoMensual; }

    public void setSueldoMensual(int sueldoMensual) {this.sueldoMensual = sueldoMensual; }

    public void setEdad(int edad) {this.edad = edad; }


    // Metodo
    public int cobrarSueldo(){
        return sueldoMensual;}

}
