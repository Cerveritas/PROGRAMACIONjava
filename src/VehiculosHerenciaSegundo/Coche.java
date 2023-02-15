package VehiculosHerenciaSegundo;

public class Coche extends Vehiculo {


    private int numeroPuertas;
    private int caballos;


    public Coche(){

    }

    public Coche(int kilometrosRealizados, String matricula, int numeroPuertas, int caballos) {
        super(kilometrosRealizados, matricula);
        this.numeroPuertas = numeroPuertas;
        this.caballos = caballos;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
