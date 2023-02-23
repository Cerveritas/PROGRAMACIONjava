package aaaEjercicio1PracticaProgramacionSegundo;

public class Lavadora extends Electrodomestrico{

    // ATRIBUTOS

    private int carga = 5;



    // CONSTRUCTORES

    public Lavadora(){
    }


    public Lavadora(int precioBase, int precioFinal, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, precioFinal, color, consumoEnergetico, peso);
        this.carga = carga;

    }


    // GETTER

    public int getCarga() {
        return carga;
    }



    // METODOS


    public int precioFinal(){

        if (carga > 30)
            return super.precioFinal + 50;
        else
            return super.precioFinal;
    }


}
