package seison1702SegundoInterfaz;

public class Coche implements IPito,IVolante{

    @Override
    public void girar() {
        System.out.println("Girando");
    }

    @Override
    public void pitar() {
        System.out.println("Piiiiiiiiiiii");
    }



}
