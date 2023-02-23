/*package aaaEjercicio1PracticaProgramacionSegundo;


import java.util.Arrays;

public abstract class Electrodomestrico{

    // ATRIBUTOS

    protected int precioBase = 100;

    protected String[] color = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
    protected char[] consumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected int peso = 5;


    // CONSTRUCTORES

    public Electrodomestrico() {
        this.precioBase = precioBase;
        this.color = color[0];
        this.consumoEnergetico = consumoEnergetico[5];
        this.peso = peso;
    }

    public Electrodomestrico(int precioBase, int precioFinal, int peso){
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestrico(int precioBase, String[] color, char[] consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    // GETTERS AND SETTERS

    public int getPrecioBase() {
        return precioBase;
    }

    public String[] getColor() {
        return color;
    }

    public char[] getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char[] consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    // METODOS


    @Override
    public String toString() {
        return "Electrodomestrico{" +
                "precioBase=" + precioBase +
                ", color=" + Arrays.toString(color) +
                ", consumoEnergetico=" + Arrays.toString(consumoEnergetico) +
                ", peso=" + peso +
                '}';
    }

    public char comprobarConsumoEnergetico(char letra){

        String s = new String();
        s = letra + "";
        letra = s.toUpperCase().charAt(0);
        for (char c : consumoEnergetico){
            if (letra == c)
                return letra;
        }
        return consumoEnergetico;
    }

    public String comprobarColor(String color) {

        for (String s:color){
            if(s.equals(color.toUpperCase()))
                return color;
        }
        return color[0];
    }


    private void calcularPrecio(){

    }


    public int precioFinal(){

        int precioConsumo = 0;
        int precioTamano = 0;

        if (consumoEnergetico == 'A')
            precioConsumo = 100;
        else if (consumoEnergetico == 'B')
            precioConsumo = 80;
        else if (consumoEnergetico == 'C')
            precioConsumo = 60;
        else if (consumoEnergetico == 'D')
            precioConsumo = 50;
        else if (consumoEnergetico == 'E')
            precioConsumo = 30;
        else if (consumoEnergetico == 'F')
            precioConsumo = 10;


        if (peso >= 0 && peso < 20)
            precioTamano = 10;
        else if (peso >= 20 && peso < 50)
            precioTamano = 50;
        else if (peso >= 50 && peso < 80)
            precioTamano = 80;
        else if (peso >= 80)
            precioTamano = 100;

        return precioBase + precioConsumo + precioTamano;


    }


}
*/