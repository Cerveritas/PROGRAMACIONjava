package sesion0901Segundo;

public class UsoPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.setDni("12345678D");
        p1.setNombre("Nahiara");
        p1.setApellidos("Zarco");
        p1.setEdad(19);

        System.out.println("EL nombre de la primera persona es "+p1.getNombre());
        System.out.println("El apellido de la primera persona es "+p1.getApellidos());
        System.out.println("EL DNI de la primera persona es "+p1.getDni());
        System.out.println("La edad de la primera persona es "+p1.getEdad());
        //-----------------------------------------------------------------------------
                                                                                        System.out.println(" ");

        Persona p2 = new Persona();

        p2.setDni("8765432S");
        p2.setNombre("Sergio");
        p2.setApellidos("Cervera");
        p2.setEdad(20);

        System.out.println("EL nombre de la segunda persona es "+p2.getNombre());
        System.out.println("El apellido de la segunda persona es "+p2.getApellidos());
        System.out.println("El DNI de la segunda persona es "+p2.getDni());
        System.out.println("La edad de la segunda persona es "+p2.getEdad());
    }


}
