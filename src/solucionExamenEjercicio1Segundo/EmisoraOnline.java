package solucionExamenEjercicio1Segundo;

public class EmisoraOnline extends Emisora implements Emitible{

    /** CONSTANTES **/
    private static final double GANACIA_POR_OYENTE = 0.023;

    /** ATRIBUTOS **/
    private String url;


    /** CONSTRUCTORES **/

    // constructor por defecto
    public EmisoraOnline(){

    }

    // constructor parametrizado
    public EmisoraOnline(String nombre_emisora, int anyo_creacion, int num_oyentes, String url) throws CreacionInvalida {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        this.url = url;
    }


    /** METODOS **/


    //metodo ganancias
    public double ganancias() {
        return num_oyentes * GANACIA_POR_OYENTE;
    }


    //metodo iniciarEmision
    public void iniciarEmision() throws OpcionInvalida {
        if (emitiendo){
            throw new OpcionInvalida("no se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando la emision "+nombre_emisora+" en "+url);
        emitiendo = true;
    }


    //metodo finalizarEmision
    public void finalizarEmision() throws OpcionInvalida {
        if (!emitiendo){
            throw new OpcionInvalida("no se puede finalizar iniciar una emision ya finalizado");
        }
        System.out.println("Finalizando la emision "+nombre_emisora+" en "+url);
        emitiendo = false;
    }
}
