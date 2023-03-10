package solucionExamenEjercicio1Segundo;

public abstract class Emisora implements Emitible {

    /** ATRIBUTOS **/ //  <-- al hacerlo static lo hacemos atributos clase, que todos los objetos comparten estas varibale

    protected static int numero_emisoras = 0;
    protected int identificador;
    protected String nombre_emisora;
    protected int anyo_creacion;
    protected boolean emitiendo = false;
    protected int num_oyentes;


    /** CONSTRUCTORES **/

    // constructor por defecto
    public Emisora(){

    }

    // constructor parametrizado
    public Emisora(String nombre_emisora, int anyo_creacion, int num_oyentes) throws CreacionInvalida{

    //**********************************************************
        this.nombre_emisora = nombre_emisora.toUpperCase();
    //**********************************************************
        this.identificador = numero_emisoras++;
    //**********************************************************
        if (anyo_creacion > 1979) {
            throw new CreacionInvalida("el año de creacion de la radie debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
    //**********************************************************
        this.num_oyentes = num_oyentes;
    //**********************************************************
        System.out.println("Se ha creado la emisora "+identificador);
    }


    /** GETTERS AND SETTERS **/

    // getters

    public static int getNumero_emisoras() {
        return numero_emisoras;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre_emisora() {
        return nombre_emisora;
    }

    public int getAnyo_creacion() {
        return anyo_creacion;
    }

    public boolean isEmitiendo() {
        return emitiendo;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }


    // setters


    public void setNombre_emisora(String nombre_emisora) {
        this.nombre_emisora = nombre_emisora.toUpperCase();
    }

    public void setAnyo_creacion(int anyo_creacion) throws CreacionInvalida {
        if (anyo_creacion > 1979) {
            throw new CreacionInvalida("el año de creacion de la radie debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }

    /** METODOS **/
    public abstract double ganancias();


    public boolean estaEmitiendo(){
        return emitiendo;
    }
}
