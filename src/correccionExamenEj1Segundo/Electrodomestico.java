package correccionExamenEj1Segundo;

import com.sun.source.doctree.SinceTree;

public abstract class Electrodomestico {

    /** ATRIBUTOS **/

    protected float precio_base = 100;
    protected float precio_final;
    protected String color = "blanco";
    protected ConsumoEnergetico consumo = ConsumoEnergetico.F;
    protected float peso = 5;


    /** CONSTRUCTORES **/

    // por defecto

    public Electrodomestico(){
    }

    // con precio y peso

    public Electrodomestico(float precio_base, float peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    // parametrizado

    public Electrodomestico(float precio_base, float precio_final, String color, ConsumoEnergetico consumo, float peso) throws ProductoIncorrecto {
        this.precio_base = precio_base;
        this.precio_final = precio_final;

        if (    comprobarColor(color)) {
            this.color = color;
        }

        this.consumo = consumo;
        this.peso = peso;
    }


    /** GETTERS AND SETTERS **/

    // getters

    public float getPrecio_base() {
        return precio_base;
    }

    public float getPrecio_final() {
        return precio_final;
    }

    public String getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public float getPeso() {
        return peso;
    }


    // setters


    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public void setColor(String color) throws ProductoIncorrecto {
        if (comprobarColor(color)){
            this.color = color;
        }


    }

    /** METODOS **/

    public boolean comprobarColor(String color) throws ProductoIncorrecto{
        if(color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")){
            return true;
        }else{
            throw new ProductoIncorrecto("Ese color no esta dentro de la gama");
        }
    }


    public boolean comoprobarConsumoEnergetico(char letra){
        boolean resultado = false;

        if (ConsumoEnergetico.A.toString().equals(letra) && precio_base >= 100 ||
                ConsumoEnergetico.B.toString().equals(letra) && precio_base >= 80 && precio_base < 100 ||
                    ConsumoEnergetico.C.toString().equals(letra) && precio_base >= 60 && precio_base < 80 ||
                        ConsumoEnergetico.D.toString().equals(letra) && precio_base >= 50 && precio_base < 60 ||
                            ConsumoEnergetico.E.toString().equals(letra) && precio_base >= 30 && precio_base < 50 ||
                                ConsumoEnergetico.F.toString().equals(letra) && precio_base >= 10 && precio_base < 30){
            resultado = true;
        }
        return resultado;
    }








}
