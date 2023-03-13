package solucionExamenEjercicio1Segundo;

public class EmisoraTradicional extends Emisora{

    /** CONSTANTES **/
    private static final double GANANCIAS_POR_OYENTE = 0.023;

    /** ATRIBUTOS **/

    private Frecuencia frecuencia; //AM, FM
    private double num_frecuencia;



    /** CONSTRUCTORES **/

    //construcor por defecto
    public EmisoraTradicional(){

    }


    //constructor parametrizado
    public EmisoraTradicional(String nombre_emisora, int anyo_creacion, int num_oyentes, double num_frecuencia) throws CreacionInvalida, IllegalArgumentException {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        //****************************************************************
        if (num_frecuencia >= 540 && num_frecuencia < 1600){
            this.frecuencia = Frecuencia.AM;
        } else if (num_frecuencia > 88.1 && num_frecuencia < 108.1) {
            this.frecuencia = Frecuencia.FM;
        }
        else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }
        this.num_frecuencia = num_frecuencia;
    }


    /** GETTERS AND SETTERS **/

    // getters

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }


    // setters

    public void setNum_frecuencia(double num_frecuencia) throws IllegalArgumentException {
        if (num_frecuencia >= 540 && num_frecuencia < 1600){
            this.frecuencia = Frecuencia.AM;
        } else if (num_frecuencia > 88.1 && num_frecuencia < 108.1) {
            this.frecuencia = Frecuencia.FM;
        }
        else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }
        this.num_frecuencia = num_frecuencia;
    }

    /** METODOS **/

    //metodo ganacias
    public double ganancias() {
        return num_oyentes * GANANCIAS_POR_OYENTE;
    }

    //metodo iniciarEmision
    public void iniciarEmision() throws OpcionInvalida {
        if (emitiendo){
            throw new OpcionInvalida("no se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando la emision "+nombre_emisora+" en "+num_frecuencia);
        emitiendo = true;
    }

    //metodo finalizarEmision
    public void finalizarEmision() throws OpcionInvalida {
        if (!emitiendo){
            throw new OpcionInvalida("no se puede finalizar iniciar una emision ya finalizado");
        }
        System.out.println("Finalizando la emision "+nombre_emisora+" en "+num_frecuencia);
        emitiendo = false;
    }
}
