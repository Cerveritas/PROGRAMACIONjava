package SimulacroExamenTercero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Filtrados {

    public static ArrayList<Persona> lista = new ArrayList<>();
    public static ArrayList<Persona> lista_filtrada = new ArrayList<>();


    public static void add(Persona p){
        lista.add(p);
    }

    public static ArrayList<Persona> filteredbyICMHigher(double icm){
        lista_filtrada.clear();
        for (Persona p:lista) {
            if (p.getIcm() > icm){
                lista_filtrada.add(p);
            }
        }
        return lista_filtrada;
    }


    public static ArrayList<Persona> filteredbyICMLower(double icm, char c){
        lista_filtrada.clear();
        for (Persona p: lista){
            if (p.getIcm() < icm && p.getClass().getName().charAt(0) == c){
                lista_filtrada.add(p);
            }
        }
        return lista_filtrada;
    }


    public static void printArray(ArrayList<Persona> listado){
        Iterator<Persona> itr = listado.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }


    public static void orderByLowerToHigherICM(){
        lista.sort(Comparator.comparing(Persona::getIcm));
        printArray(lista);
    }



    public static void orderByLowerToLowerICM(){
        lista.sort(Comparator.comparing(Persona::getIcm).reversed());
        printArray(lista);
    }
}
