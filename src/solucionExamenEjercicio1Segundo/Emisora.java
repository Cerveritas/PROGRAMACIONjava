package solucionExamenEjercicio1Segundo;

public abstract class Emisora implements Emitible {

    // atributos  <-- al hacerlo static lo hacemos atributos clase, que todos los objetos comparten estas varibale

    protected int numero_emisoras=0;
    protected int identificador;
    protected String nombre;
    protected int anyo_creacion;
    protected boolean emitiendo;
    protected int num_oyentes;



}
