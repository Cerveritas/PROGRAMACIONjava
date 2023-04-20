package EjercicioSetTercero1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJugadores {

    HashSet <Jugador> FCBetis = new HashSet <> ();
    HashSet <Jugador> conjunto2 = new HashSet<>();

    public void initialize(){
        FCBetis.add(new Jugador("Luis Felipe", 24, "DEFENSA"));
        System.out.println("Coleccion insertada correctamente.");
    }

    public void add(Jugador jug){
        FCBetis.add(jug);
    }

    public void showBetis(){
        Iterator<Jugador> itr1 = FCBetis.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next().toString());
        }
    }

    public boolean contains(Jugador jug){
        boolean esta = false;
        if (FCBetis.contains(jug)){
            esta = true;
        }
        return esta;
    }

    public void add2(){
        conjunto2.add(new Jugador("Nahiara", 20, "DELANTERO"));
        conjunto2.add(new Jugador("Sergio", 20, "DEFENSA"));
        System.out.println("Coleccion insertada correctamente.");
    }

    public void compare(){
        if (FCBetis.containsAll(conjunto2)){
            System.out.println("Los jugadores del conjunto2 estan contenidos.");
        } else {
            System.out.println("Los jugadores no estan contenidos.");
        }
    }

    public void merge(){
        System.out.println(FCBetis.addAll(conjunto2));
    }

    public void borrar(){
        FCBetis.clear();
        conjunto2.clear();

        System.out.println("Borrado realizado correctamente");
    }
}
