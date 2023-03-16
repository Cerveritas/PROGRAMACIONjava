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
        this.precio_final = precioFinal();
    }

    // parametrizado

    public Electrodomestico(float precio_base, float precio_final, String color, String consumo, float peso) throws ProductoIncorrecto {
        if (comoprobarConsumoEnergetico(consumo.toUpperCase().charAt(0))){
            this.precio_base = precio_base;
            this.consumo = ConsumoEnergetico.valueOf(consumo.toUpperCase());
        }
        else{
            throw new ProductoIncorrecto("No es correcto la letra con el precio");
        }


        this.precio_final = precioFinal();

        if (comprobarColor(color)) {
            this.color = color;
        }


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

    public float precioFinal(){

        switch (consumo){
            case A:
                precio_final = precio_base + 100;
                break;

            case B:
                precio_final = precio_base + 80;
                break;

            case C:
                precio_final = precio_base + 60;
                break;

            case D:
                precio_final = precio_base + 50;
                break;

            case E:
                precio_final = precio_base + 30;
                break;

            case F:
                precio_final = precio_base + 10;
                break;
        }
        if (peso > 0 && peso <= 19){
            precio_final += 10;
        } else if (peso >= 20 && peso <= 49) {
            precio_final += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio_final += 80;
        }else {
            precio_final += 100;
        }

        return precio_final;
    }
}
