package CosasCasaSerias;

public class UsoAmbas {
    public static void main(String[] args) {

        Universidad u = new Universidad("URJC");
        Alumno alu = new Alumno("Nahiara");
        System.out.println(alu.getNombre()+" es alumna de la Universidad "+u.getNombre());


    }

}
