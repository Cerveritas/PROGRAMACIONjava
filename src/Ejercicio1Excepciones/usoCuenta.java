package Ejercicio1Excepciones;

public class usoCuenta {
    public static void main(String[] args) throws CantidadIncorrecta {

        Cuenta cuenta1 = new Cuenta("Sergio",12343, 200.12);


        System.out.println(cuenta1);

        cuenta1.ingresar(1200);
        System.out.println(cuenta1);

        cuenta1.retirar(6000);


    }
}
