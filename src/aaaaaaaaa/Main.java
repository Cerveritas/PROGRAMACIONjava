package aaaaaaaaa;

public class Main {
    public static void main(String[] args) {



        Hija hija1 = new Hija(5,4,120,"Fiat","Bravo");


        System.out.println("El coche tiene: \n" +
                " "+ hija1.getPuertas()+" puertas,\n" +
                " "+ hija1.getRuedas()+" ruedas,\n" +
                " "+ hija1.getCaballos()+" caballos y\n" +
                " siendo un "+ hija1.getTipoCoche().toUpperCase()+" "+ hija1.getMarca());





    }
}
