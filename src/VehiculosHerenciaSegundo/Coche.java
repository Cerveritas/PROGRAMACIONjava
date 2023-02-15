package VehiculosHerenciaSegundo;

public class Coche extends Vehiculo {


    // atributos
    private int numeroPuertas;
    private int caballos;



    // constructores
    public Coche(){

    }

    public Coche(int kilometrosRealizados, String matricula, int numeroPuertas, int caballos) {
        super(kilometrosRealizados, matricula);
        this.numeroPuertas = numeroPuertas;
        this.caballos = caballos;
    }


    // getters and setters
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


    // metodos


    public String showInfo() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                ", caballos=" + caballos +
                ", kilometrosRealizados=" + kilometrosRealizados +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
