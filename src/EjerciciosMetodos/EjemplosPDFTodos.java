package EjerciciosMetodos;

public class EjemplosPDFTodos {
    public static void main(String[] args) {

    System.out.println("Uso de metodos String");

    // DECLARAMOS LOS STRINGS Y LOS INICIALIZAMOS CON SUS NOMBRES.
    String nombre = "Sergio";
    String nombre2 = "Nahiara";
    String nombre3 = "Elena";
    String nombre4 = "Sofia";
    String nombre5 = "Sofias";
    String nombre6 = "";

    // A CONTINUACION HAREMOS USO DE LOS SIGUIENTES METODOS DE STRING:


        // ESTE METODO TE SACA LA POSICION ELEGIDA DEL STRING
    System.out.println("Una posicion --> "+nombre.charAt(0));

        // ESTE METODO COMPARA DOS STRINGS
    System.out.println("Compara dos Strings --> "+nombre.compareTo(nombre2));

        // ESTE METODO COMPARA DOS STRING IGNORANDO LAS MAYUSCULAS
    System.out.println("Comparar ignorando mayusculas --> "+nombre.compareToIgnoreCase(nombre3));

        // ESTE METODO JUNTA LOS DOS STRING A ELEGIR (CONCATENA)
    System.out.println("Concatenar --> "+nombre.concat(nombre4));

        // ESTE METODO TE DEVUELVE TRUE O FALSE SEGUN SI LOS DOS STRING TIENEN EL MISMO CONTENIDO O NO
    System.out.println("Si contiene otra --> "+nombre.contains(nombre2));

        // ESTE METODO EN ESTE CASO DEVUELVE TRUE O FALSE SEGUN SI TERMINA EN UNA TERMINACION EL STRING O NO
    System.out.println("Si termina en '-ara' --> "+nombre2.endsWith("ara"));

        // DEVUELVE TRUE O FALSE SEGUN SI LOS STRING A COMPARAR SON IGUALES O NO
    System.out.println("Si son iguales --> "+nombre4.equals(nombre5));

        // DEVUELVE LA POSICION EN LA QUE SE ENCUETRA LA SIGUIENTE LETRA
    System.out.println("Donde esta la 'e' --> "+nombre.indexOf('e'));

        // DETERMINA DONDE ESTA LA LETRA ELEGIDA DEASDE CIERTA POSICION
    System.out.println("Donde esta la 'e' desde cierta posicion --> "+nombre.indexOf('e', 1));

        // DEVUELVE TRUE SI EL STRING SE ENCUENTRA VACIO Y FALSE SI ESTA LLENO
    System.out.println("Si un String esta vacio --> "+nombre6.isEmpty());

        // ESTE METODO ELIMINA LOS ESPACIOS EN BLANCO
    System.out.println("Eliminar espacios en blanco --> "+nombre5.trim());

        // ESTE METODO TE DEVUELVE EL STRING EN UN ARRAY DE CHAR
    System.out.println("Devuelve un array de char --> "+nombre4.toCharArray());

        //REEMPLAZA UNA LETRA DEL STRING POR OTRA
    System.out.println("Reemplazo 'i' por la 'e' --> "+nombre2.replace('i', 'e'));


    }
}
