package seison1702SegundoInterfaz;

public class Vehiculo {


    private int puertas;
    private int caballos;


    public Vehiculo(){

    }


    public Vehiculo(int puertas, int caballos) {
        this.puertas = puertas;
        this.caballos = caballos;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

}
