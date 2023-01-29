package sesion0211;

public class PasoValorObjetos {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Raul";
        System.out.println(p1.nombre);
        tranformarNombre(p1);
        System.out.println("Despues de pasarle el metodo tranformarNombre...");
        System.out.println("El nombre es "+p1.nombre);

    }

    static void tranformarNombre (Persona p){
        p.nombre = "Sergio";
    }

}
