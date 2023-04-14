package Ejercicio1PracticaProgramacionSegundo;

public class Television extends Electrodomestico{

    // ATRIBUTOS

    private int resolucion = 20;
    private boolean sintonizadorTDT = false;


    // CONSTRUCTORES

    public Television(){

    }


    public Television(int precioBase, int precioFinal, int peso, Colores color, ConsumoEnergetico consumo, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumo, precioFinal);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    // GETTERS


    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }


    // SETTERS


    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }



    // METODOS


    @Override
    public double precioFinal(){
        double valorAñadido = 0;
        if (resolucion > 40){
            valorAñadido += getPrecioBase()*0.3;
        }
        if (sintonizadorTDT){
            valorAñadido += 50;
        }
        return super.precioFinal()+valorAñadido;
    }
}
