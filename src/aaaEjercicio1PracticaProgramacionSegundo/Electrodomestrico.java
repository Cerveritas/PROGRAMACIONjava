package aaaEjercicio1PracticaProgramacionSegundo;

public abstract class Electrodomestrico{

    // ATRIBUTOS

    protected int precioBase = 100;
    protected int precioFinal;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected int peso = 5;


    // CONSTRUCTORES

    public Electrodomestrico(){

    }

    public Electrodomestrico(int precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestrico(int precioBase, int precioFinal, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.precioFinal = precioFinal;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    // GETTERS AND SETTERS

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // METODOS

    public void comprobarConsumoEnergetico(char letra){

    }

    public void comprobarColor(String color){

    }


    public int precioFinal(){
        return 0;
    }


}
