package VehiculosHerenciaSegundo;

public class Camion extends Vehiculo{

    public int numeroEjes;


    public Camion(){

    }


    public Camion(int kilometrosRealizados, String matricula, int numeroEjes) {
        super(kilometrosRealizados, matricula);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
