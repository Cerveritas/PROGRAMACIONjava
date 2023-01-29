package sesion1411;

public class BusquedaArrayBinarySearch {
    public static void main(String[] args) {
//no funciona bien del todo
        String[] alumnos = {"Sergio","Nahiara","Peter","Serpe"};

        int posicion = java.util.Arrays.binarySearch(alumnos,"nahiara");
        if (posicion<0)
        {
            System.out.println("El nombre no se encuentra en la lista");
        }
        else
        {
            System.out.println("El alumno "+alumnos[posicion]+" sta en la posicion "+posicion);
        }
    }
}


