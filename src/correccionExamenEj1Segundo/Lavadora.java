package correccionExamenEj1Segundo;

public class Lavadora extends Electrodomestico{


    /** ATRIBUTOS **/

        /** atributos*/

    private float carga = 5;



    /** CONSTRUCTORES **/

        /** constructores son 3*/

    //por defecto
    public Lavadora(){

    }

    /**
     *
     * @param precio_base
     * @param peso
     * @param carga
     */


    //parametrizado con precio y base
    public Lavadora(float precio_base, float peso, float carga) {
        super(precio_base, peso);
        this.carga = carga;
    }

    //parametrizado con todoo
    public Lavadora(float precio_base, float precio_final, String color, String consumo, float peso, float carga) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo, peso);
        this.carga = carga;
    }


    /** GETTERS AND SETTERS **/

    //getters

    public float getCarga() {
        return carga;
    }

    //setters

    public void setCarga(float carga) {
        this.carga = carga;
    }


    /** METODOS **/

    @Override
    public float precioFinal(){
        precio_final = super.precioFinal();

        if (carga > 30){
            precio_final += 50;
        }
        return precio_final;
    }























}
