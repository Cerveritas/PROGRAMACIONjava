package bbbEjercicio1PracticaProgramacionSegundo;

public abstract class Electrodomestico {


    // ATRIBUTOS

    protected int precioBase;
    protected int peso;
    protected Colores color;
    protected ConsumoEnergetico consumo;
    protected int preciofinal;


    // CONSTRUCTORES


    public Electrodomestico(){
        this.precioBase = 100;
        this.peso = 5;
        this.color = Colores.blanco;
        this.consumo = ConsumoEnergetico.F;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }


    public Electrodomestico(int precioBase, int peso, Colores color, ConsumoEnergetico consumo, int preciofinal) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
        this.preciofinal = preciofinal;
    }


    // GETTERS

    public int getPrecioBase() {
        return precioBase;
    }

    public int getPeso() {
        return peso;
    }

    public Colores getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public int getPreciofinal() {
        return preciofinal;
    }


    // SETTERS

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setConsumo(ConsumoEnergetico consumo) {
        this.consumo = consumo;
    }


    // METODOS


    private void comprobarConsumoEnergetico(char letra){

        }



    public void comprobarColor(String colorUs) throws ProductoIncorrecto {
        if (colorUs.toLowerCase() == color.toString()){

        }
        throw new ProductoIncorrecto("Ese color no es de la gama");
    }



     public abstract int precioFinal();
}
