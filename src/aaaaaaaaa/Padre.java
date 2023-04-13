package aaaaaaaaa;

public class Padre {


    protected int puertas;
    protected int ruedas;
    protected int caballos;



    public Padre(){

    }


    public Padre(int puertas, int ruedas, int caballos) {
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.caballos = caballos;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
