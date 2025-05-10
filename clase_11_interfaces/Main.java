public class Main {
    public static void main(String[] args) {
        //instance
        Tigre tigre = new Tigre("max", 5, 2, "Naranja");
        Leon leon = new Leon("Simba", 7, 3, "Africana");
        Puma puma = new Puma("Blanco", 4, 1, 80);
        Lobo lobo = new Lobo("Lobito", 6, 2, "Manada Alfa");
        Perro perro = new Perro("Rex", 3, 1, "Pastor Alemán");
        Zorro zorro = new Zorro("Rojo", 2, 4, "Bosques");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry", 5, 2);

        //impression

        System.out.println(tigre.getNombre() + " es un tigre de color " + tigre.getColor());
        System.out.println(leon.getNombre() + " es un león de raza " + leon.getRaza());
        System.out.println(puma.getNombre() +  " es un puma que corre a " + puma.getVelocidad() + " km/h");
        System.out.println(lobo.getNombre() + " es un lobo que pertenece a la " + lobo.getTipoManada());
        System.out.println(perro.getNombre() + " es un perro de raza " + perro.getRaza());
        System.out.println(zorro.getNombre() + " es un zorro que vive en " + zorro.getHabitat());
        System.out.println(ornitorrinco.getNombre() + " es un ornitorrinco de " + ornitorrinco.getEdad() + " años.");




        //metodos
        tigre.rugir();
        leon.rugir();
        puma.correr();
        lobo.aullar();
        perro.ladrar();
        zorro.cazar();
        ornitorrinco.amamantar();
        ornitorrinco.parir();
        ornitorrinco.ponerHuevos();
        ornitorrinco.romperCascaron();



    }



}
