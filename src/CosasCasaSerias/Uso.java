package CosasCasaSerias;

public class Uso {

    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();

        taxi1.setMatricula("1234BGH");
        taxi1.setModelo("Skoda Fabia");
        taxi1.setPotenciaCV(100);
        taxi1.setNumeroLicencia("4553");

        System.out.println("El taxi tiene "+
                "\n matricula "+taxi1.getMatricula()+
                "\n modelo de coche "+taxi1.getModelo()+
                "\n con potencia "+taxi1.getPotenciaCV()+
                "\n numero de licencia "+taxi1.getNumeroLicencia());

        System.out.println(" ");
        System.out.println(" ");

/*************************************************************************************************/


        Autobus bus1 = new Autobus();

        bus1.setMatricula("34553PR");
        bus1.setModelo("Pegasus");
        bus1.setNumeroPlazas(90);

        System.out.println("El autobus tiene "+
                "\n matricula: "+bus1.getMatricula()+
                "\n modelo del autobus: "+bus1.getModelo()+
                "\n con potencia de  "+bus1.getPotenciaCV()+
                "\n y capacidad de "+bus1.getNumeroPlazas()+" personas.");












    }
}
