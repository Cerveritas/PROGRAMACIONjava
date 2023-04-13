package Ejercicio1PracticaProgramacionSegundo;

public abstract class Electrodomestico {


    // ATRIBUTOS

    protected int precioBase;
    protected int peso;
    protected Colores color;
    protected ConsumoEnergetico consumo;
    protected int preciofinal;


    // CONSTRUCTORES


    public Electrodomestico() {
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


    private void comprobarConsumoEnergetico(char letra) throws ProductoIncorrecto {

        switch (letra) {
            case 'A':
                if (precioBase >= 100) return;
                break;
            case 'B':
                if (precioBase >= 80 || precioBase < 100) return;
                break;
            case 'C':
                if (precioBase >= 60 || precioBase < 80) return;
                break;
            case 'D':
                if (precioBase >= 50 || precioBase < 60) return;
                break;
            case 'E':
                if (precioBase >= 30 || precioBase < 50) return;
                break;
            case 'F':
                if (precioBase >= 10 || precioBase < 30) return;
                break;
        }
        throw new ProductoIncorrecto("No es correcto la letra con precio");

    }


    public void comprobarColor(String color) throws ProductoIncorrecto {

        boolean encontrado = false;

        for (int i = 0; i < Colores.values().length; i++) {
            if (Colores.values()[i].toString().equals(color)) encontrado = true;
        }

        if (encontrado == false) {
            throw new ProductoIncorrecto("El color no está dentro de la gama");
        }
    }

    public double precioFinal(){
        double precio = precioBase;
        switch (getConsumo()) {
            case A:
                precio += 100;
                break;
            case B:
                precio += 80;
                break;
            case C:
                precio += 60;
                break;
            case D:
                precio += 50;
                break;
            case E:
                precio += 30;
                break;
            case F:
                precio += 10;
                break;
        }
        if (getPeso() >= 0 && getPeso() < 20) {
            precio += 10;
        } else if (getPeso() >= 20 && getPeso() < 50) {
            precio += 50;
        } else if (getPeso() >= 50 && getPeso() < 80) {
            precio += 80;
        } else if (getPeso() > 80) {
            precio += 100;
        }
        return precio;
    }

}