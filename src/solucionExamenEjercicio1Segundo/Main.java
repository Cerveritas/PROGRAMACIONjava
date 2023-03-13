package solucionExamenEjercicio1Segundo;

public class Main {
    public static void main(String[] args) throws CreacionInvalida, OpcionInvalida {

    try {

        EmisoraTradicional emisoraTradicional1 = new EmisoraTradicional("Los40", 1993, 5000, 93.9);
        EmisoraTradicional emisoraTradicional2 = new EmisoraTradicional("Cadena Dial", 2000, 50000, 93.9);
        EmisoraTradicional emisoraTradicional3 = new EmisoraTradicional("Radio Gatitas", 2005, 1000, 666);

        EmisoraOnline emisoraOnline1 = new EmisoraOnline("RN5 Todo noticias", 1985, 800000, "www.rn5.com");
        EmisoraOnline emisoraOnline2 = new EmisoraOnline("ChinaFM", 2010, 123213, "www.chinaFM.es");






        /* // esto es una mamera de hacer el array pero preferimos la otra
        Emisora[] lista_emisoras = new Emisora[5];
        lista_emisoras[0] = emisoraOnline1;
        */

        Emisora[] lista_emisoras = {emisoraTradicional1, emisoraTradicional2, emisoraTradicional3, emisoraOnline1, emisoraOnline2};

        for (int i = 0; i < lista_emisoras.length; i++) {
            System.out.println("La " + lista_emisoras[i].getClass().getSimpleName() + " tiene " + lista_emisoras[i].getNum_oyentes() + " con ganacias de " + lista_emisoras[i].ganancias());
        }


        /** FORZAR LAS EXEPCIONES **/

        // 1. iniciar una emision ya iniciada

            //emisoraOnline1.iniciarEmision();
            //emisoraOnline1.iniciarEmision();


        // 2. finalizar una emision ya finalizada

            //emisoraOnline1.finalizarEmision();
            //emisoraOnline1.finalizarEmision();

        // 3. el año de creacion de la emisora es menor a 1879

            //EmisoraOnline emisoraOnline3 = new EmisoraOnline("ChinaFM", 1200, 123213, "www.chinaFM.es");

        // 4. elegir un num_frecuencia que no este en rango

            //EmisoraTradicional emisoraTradicional4 = new EmisoraTradicional("Radio Gatitas", 2000, 1000, 200);

    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
