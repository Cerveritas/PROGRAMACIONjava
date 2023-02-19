package seison1702SegundoInterfaz;

public class UsoTodo {
    public static void main(String[] args) {

        Coche coche1 = new Coche(12,122,"seat","azul");



        System.out.println(coche1.getPuertas());
        System.out.println(coche1.getCaballos());
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getColor());

        coche1.girar();
        coche1.pitar();


    }
}
