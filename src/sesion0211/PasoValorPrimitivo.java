package sesion0211;

public class PasoValorPrimitivo {
    public static void main(String[] args) {
        int edadSergio = 20;
        cambiarEdadSergio(edadSergio);
        System.out.println("La edad de Sergio es "+edadSergio);
    }

    private static void cambiarEdadSergio(int edad){

        edad = 30;
    }
}

