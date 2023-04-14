package ut7.sesion1304.Tercero;

import java.util.ArrayList;

public class Generica {
    public static void main(String[] args) {

        // todas las maneras de declarar estos arrays
        ArrayList<String> arraydinamicoString = new ArrayList<>(); //declaramos el array de String
        ArrayList<Integer> arraydinamicoInteger = new ArrayList<>(); //declaramos el array de Integer
        ArrayList<Persona> arraydinamicoPersona = new ArrayList<>(); // declaramos el array de clase Persona

        // todas las maneras de inicializar el array de String e imprimirlo con un ToString
        arraydinamicoString.add("Sofia");
        arraydinamicoString.add("Sergio");
        arraydinamicoString.add("Nahiara");
        System.out.println(arraydinamicoString.toString());
                                                                                                                        System.out.println(" ");
        // todas las maneras de inicializar el array de integer e imprimirlo con un ToString
        arraydinamicoInteger.add(4);
        arraydinamicoInteger.add(5);
        arraydinamicoInteger.add(7);
        arraydinamicoInteger.add(10);
        arraydinamicoInteger.add(20);
        System.out.println(arraydinamicoInteger.toString());
                                                                                                                        System.out.println(" ");
        // todas las maneras de inicializar el array de clase Persona e imprimirlo con un ToString
        arraydinamicoPersona.add(new Persona("49701191P"));
        arraydinamicoPersona.add(new Persona("12345678D"));
        arraydinamicoPersona.add(new Persona("56456455H"));
        // estas 2 siguientes lineas se muestran otra manera de declararlo e inicializarlo
        Persona p1 = new Persona("234535f");

        arraydinamicoPersona.add(p1);
        System.out.println(arraydinamicoPersona.toString());




    }

}
