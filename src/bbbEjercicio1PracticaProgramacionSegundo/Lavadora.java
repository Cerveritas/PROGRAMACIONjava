package bbbEjercicio1PracticaProgramacionSegundo;

public class Lavadora extends Electrodomestico {


    // ATRIBUTOS

    private int carga = 5;


    // CONTRUCTORES

    public Lavadora(){

    }


    public Lavadora(int precioBase, int peso, Colores color, ConsumoEnergetico consumo, int preciofinal, int carga) {
        super(precioBase, peso, color, consumo, preciofinal);
        this.carga = carga;
    }


    // GETTERS


    public int getCarga() {
        return carga;
    }



    public int precioFinal(){

        if (carga > 30)
            return super.preciofinal + 50;
        else
            return super.preciofinal;
    }
}


