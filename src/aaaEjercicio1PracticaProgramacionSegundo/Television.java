/*package aaaEjercicio1PracticaProgramacionSegundo;

public class Television extends Electrodomestrico{

    // ATRIBUTOS

    private int resolucion = 20;
    private boolean sintonizadorTDT = false;


    // CONSTRUCTORES

    public Television(){

    }


    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    // GETTERS AND SETTERS

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }




    public int precioFinal(){

        if (sintonizadorTDT){
            if (resolucion > 40 )
                return Math.round((super.precioFinal() * 1.30f)) + 50;
            else
                return super.precioFinal() + 50;
        }else{
            if (resolucion > 40)
                return Math.round((super.precioFinal() * 1.30f));
            else
                return super.precioFinal;
        }
    }

















}
*/