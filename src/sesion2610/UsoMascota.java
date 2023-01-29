package sesion2610;

public class UsoMascota {
    public static void main(String[] args) {
        mascota mascota1 = new mascota();
        //mascota1.edad=11; <--- esto si el atributo estuviera publico
        mascota1.setEdad(11);

        System.out.println("La edad de mi mascota es "+mascota1.getEdad());






    }
}
