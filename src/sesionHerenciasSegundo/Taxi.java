package sesionHerenciasSegundo;

public class Taxi extends Vehiculo {


    //atributos
    private int numeroLicencia;


    //constructores

    public Taxi(){

    }

    public Taxi(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }



    //getters and setters

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
