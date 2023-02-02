package Ejercicio1Segundo2;

public class MainLibroEditorial {
    public static void main(String[] args) {


        Editorial editorial1 = new Editorial(23444, "CerviDitorial", 3432);
        Libro libro1 = new Libro("32h443", "Sergiorg", 2002, 20, editorial1);
        Editorial editorial2 = new Editorial(23445, "Recarte.doc", 565);

        System.out.println("La ISBN del libro1 es "+libro1.getIsbn());
        System.out.println("El titulo de nuestro libro es "+libro1.getTitulo());
        System.out.println("El año de nuestro libro es "+libro1.getAnio());
        System.out.println("El precio de nuestro libro es de "+libro1.getPrecio());

        libro1.setEditorial(editorial2);
        System.out.println("La editorial es "+libro1.getEditorial().getAnioEditorial());




    }
}
