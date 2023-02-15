package VehiculosHerenciaSegundo;

public class Camion extends Vehiculo{

    // atributos
    public int numeroEjes;


    // constructores
    public Camion(){

    }

    public Camion(int kilometrosRealizados, String matricula, int numeroEjes) {
        super(kilometrosRealizados, matricula);
        this.numeroEjes = numeroEjes;
    }


    // getters and setters
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }



    // metodos
    public String showInfo() {
        return "Camion{" +
                "numeroEjes=" + numeroEjes +
                ", kilometrosRealizados=" + kilometrosRealizados +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
