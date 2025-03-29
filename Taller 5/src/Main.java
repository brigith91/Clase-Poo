/* Punto 1

public class Main {
    public static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego("The Witcher 3", "RPG", 2015, 9.5, true);

        System.out.println(juego1.consultarAntiguedad(2024));
        System.out.println(juego1.disponibilidad());
        System.out.println(juego1.verificarCalificacion());
    }
}


 */

/* Punto 2
public class Main {
    public static void main(String[] args) {
        SistemaDeGestion sistema1 = new SistemaDeGestion("Gestión Académica", "SG001", 50, 100, true);

        System.out.println("¿El sistema tiene cupo disponible?: " + sistema1.verificarCupoMaximo());
        System.out.println("¿El curso está activo?: " + sistema1.verificacionEstadoDeCurso());
    }
}
*/

/* Punto 2

public class Main {
    public static void main(String[] args) {
        InventVehConcesionario vehiculo1 = new InventVehConcesionario("Toyota", "Corolla", 2020, 20000, "Nuevo", true);

        System.out.println(vehiculo1.verificarEstadoVehiculo());
        System.out.println("¿El vehículo está disponible?: " + vehiculo1.verificacionDisponibilidad(2024));
    }
}

*/
public class Main {
    public static void main(String[] args) {
        /*SistemaDeSeguimientoEnvios envio1 = new SistemaDeSeguimientoEnvios("ABC123", "Calle 123", 5.5, "En tránsito", false);

        System.out.println(envio1.consultarEstadoDelPaquete("entregado"));
*/

        /*SistemaDeGestion sistema1= new SistemaDeGestion( "Poo", "A101",0,5,true);
        System.out.println( sistema1.verificacionEstadoDeCurso()); */

        /*VideoJuego juego1 = new VideoJuego("bombas", "comedia", 2010, 5.0, true);
        System.out.println(juego1.disponibilidad());*/

        Vehiculo vehiculo1 = new Vehiculo("toyota", "2015",2015,15.0,"disponible",true);
        System.out.println(vehiculo1.verificacionDisponibilidad());
        System.out.println(vehiculo1.verificarEstadoVehiculo());
    }

}
