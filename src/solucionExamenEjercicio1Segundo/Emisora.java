package solucionExamenEjercicio1Segundo;

public abstract class Emisora implements Emitible {

    // atributos  <-- al hacerlo static lo hacemos atributos clase, que todos los objetos comparten estas varibale

    protected static int numero_emisoras=0;
    protected static int identificador;
    protected static String nombre;
    protected static int anyo_creacion;
    protected static boolean emitiendo;
    protected static int num_oyentes;



}
