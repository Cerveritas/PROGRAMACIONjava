package correccionExamenEj1Segundo;

public class Television extends Electrodomestico{

    /** ATRIBUTOS **/

        /**atributos de la clase hija Television*/

    private int resolucion;
    private boolean sintonizadorTDT;

    /** CONTRUCTORES **/

        /** la clase television tiene tres constructores*/

    // por defecto
    public Television(){

    }

    /**
     *
     * @param precio_base
     * @param peso
     * @param resolucion
     * @param sintonizadorTDT
     */

    // parametrizado con precio_base y peso
    public Television(float precio_base, float peso, int resolucion, boolean sintonizadorTDT) {
        super(precio_base, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // parametrizado con todoo
    public Television(float precio_base, float precio_final, String color, String consumo, float peso, int resolucion, boolean sintonizadorTDT) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    /** GETTERS AND SETTERS **/

    //getters

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //setters

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /** METODOS **/

    @Override
    public float precioFinal(){
        float resultado = 0;

        resultado = super.precioFinal();
        if (resolucion > 40){
            resultado = (float) (resultado + resultado*0.3);
        }
        if (isSintonizadorTDT()){
            resultado += 50;
        }
        return resultado;
    }
}
