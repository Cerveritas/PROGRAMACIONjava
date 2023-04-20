package EjercicioSetTercero1;

public class UsoHashSetJugadores {
    public static void main(String[] args) {


        HashSetJugadores obj = new HashSetJugadores();

        obj.initialize();

        Jugador jugador = new Jugador("Joaquin", 33, "DELANTERO");
        obj.add(jugador);
        if( obj.contains(jugador)){
            System.out.println("El jugador esta contenido");
        } else {
            System.out.println("El jugador no esta contenido");
        }

        System.out.println("AÑADIR NUEVO CONJUNTO");
        obj.add2();

        System.out.println("UNIR AMBOS CONJUNTOS");
        obj.merge();

        System.out.println("MOSTRAR AMBOS CONJUNTOS");
        obj.showBetis();

















    }
}
