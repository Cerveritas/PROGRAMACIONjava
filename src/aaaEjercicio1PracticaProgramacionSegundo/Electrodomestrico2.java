package aaaEjercicio1PracticaProgramacionSegundo;

public abstract class Electrodomestrico2 {

    // ATRIBUTOS

    protected int precioBase = 100;
    protected Colores color = Colores.blanco;
    protected letrasConsumo letraconsumo = letrasConsumo.F;
    protected int peso = 5;


    // CONSTUCTORES


    public Electrodomestrico2() {
    }

    public Electrodomestrico2(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }


    public Electrodomestrico2(int precioBase, Colores color, letrasConsumo letraconsumo, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.letraconsumo = letraconsumo;
        this.peso = peso;
    }


    // GETTERS


    public int getPrecioBase() {
        return precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public letrasConsumo getLetraconsumo() {
        return letraconsumo;
    }

    public int getPeso() {
        return peso;
    }


    // SETTERS


    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setLetraconsumo(letrasConsumo letraconsumo) {
        this.letraconsumo = letraconsumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    // METODOS


    private boolean consumoEnergetico(char letra) {

        boolean exist = false;

        switch (letra) {

            case 'A':
                exist = true;
                this.precioBase = 100;

            break;

            case 'B':
                exist = true;
                this.precioBase = 80;
            break;

            case 'C':
                exist = true;
                this.precioBase = 60;
            break;

            case 'D':
                exist = true;
                this.precioBase = 50;
            break;

            case 'E':
                exist = true;
                this.precioBase = 30;
            break;

            case 'F':
                exist = true;
                this.precioBase = 10;
            break;


        }
        if (exist) {
            this.consumoEnergetico(letra);
        }
        return exist;
    }


    public void comprobarColor(String colores) throws ExceptionPrueba {



        if (color.equals(Colores.blanco) || colores.equals(Colores.azul)
            || color.equals(Colores.gris) || colores.equals(Colores.rojo)
            || color.equals(Colores.negro))
            throw new ExceptionPrueba("hola esto mal");


    }






}
