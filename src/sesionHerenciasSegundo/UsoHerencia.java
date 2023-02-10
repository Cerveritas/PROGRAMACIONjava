package sesionHerenciasSegundo;

public class UsoHerencia {

    public static void main(String[] args) {

        //un objeto de la clase hija Taxi
        Taxi uber = new Taxi();

        uber.setMatricula("1234FSD");
        uber.setModelo("Fiat Bravo");
        uber.setPotenciaCV(100);
        uber.setNumeroLicencia(13234);

        System.out.println("El taxi tiene "+
                "\n matricula "+uber.getMatricula()+
                "\n modelo "+uber.getModelo()+
                "\n con potencia "+uber.getPotenciaCV()+" CV"+
                "\n y numero de potencia "+uber.getNumeroLicencia());




    }
}
