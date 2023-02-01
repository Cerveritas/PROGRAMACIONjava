package Ejercicio1Segundo;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();

        System.out.println("El vehiculo uno es de la marca "+vehiculo1.getMarca());
        System.out.println("El vehiculo uno es de color "+vehiculo1.getColor());
        System.out.println("El vehiculo uno tiene de placa "+vehiculo1.getPlaca());
        System.out.println("El vehiculo uno es el modelo "+vehiculo1.getModelo());
        System.out.println("El vehiculo uno tiene de referencia "+vehiculo1.getReferencia());
        System.out.println("El vehiculo uno tiene como valor "+vehiculo1.getValor());
        System.out.println("El vehiculo uno tiene una velocidad de  "+vehiculo1.getVelocidad());
        System.out.println("El vehiculo uno esta en la marcha "+vehiculo1.getMarcha());

        vehiculo1.apagar();

System.out.println(" ");
System.out.println(" ");

/********************************************************************************************************************************/
        Vehiculo vehiculo2 = new Vehiculo(Marca.AUDI,"AUDI A3",1,"1234567G","Gris",20000);

        System.out.println("El vehiculo dos es de la marca "+vehiculo2.getMarca());
        System.out.println("El vehiculo dos es de color "+vehiculo2.getColor());
        System.out.println("El vehiculo dos tiene de placa "+vehiculo2.getPlaca());
        System.out.println("El vehiculo dos es el modelo "+vehiculo2.getModelo());
        System.out.println("El vehiculo dos tiene de referencia "+vehiculo2.getReferencia());
        System.out.println("El vehiculo dos tiene como valor "+vehiculo2.getValor());
        System.out.println("El vehiculo dos tiene una velocidad de  "+vehiculo2.getVelocidad());
        System.out.println("El vehiculo dos esta en la marcha "+vehiculo2.getMarcha());

        vehiculo2.acelerar(20);
        vehiculo2.cambiarmarcha(2);
        vehiculo2.cambiarmarcha(9);
        vehiculo2.frenar(10);
        vehiculo2.cambiarmarcha(1);
        vehiculo2.apagar();





    }
}
