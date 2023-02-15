package VehiculosHerenciaSegundo;

public class Moto extends Vehiculo{

    // atributos
    private int cilindrada;


    // constructores
    public Moto(){

    }

    public Moto(int kilometrosRealizados, String matricula, int cilindrada) {
        super(kilometrosRealizados, matricula);
        this.cilindrada = cilindrada;
    }


    // getters and setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    // metodos

    public String showInfo() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", kilometrosRealizados=" + kilometrosRealizados +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
