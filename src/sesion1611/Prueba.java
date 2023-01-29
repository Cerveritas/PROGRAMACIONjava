package sesion1611;

public class Prueba {
    public static void main(String[] args) {


        System.out.println(buscadorString("Hola soy Sergio", "soy"));
    }

    public static int buscadorString(String lista, String busqueda)
    {
        String[] listaSplit = lista.split(" ");
            for (int i = 0; i<listaSplit.length; i++)
            {
                if(listaSplit[i].equals(busqueda))
                {
                    return i;
                }
            }
        return -1;
    }


}