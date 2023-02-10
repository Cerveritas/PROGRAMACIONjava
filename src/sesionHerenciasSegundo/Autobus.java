package sesionHerenciasSegundo;

public class Autobus extends Vehiculo
{


    //atributos
    private int numeroPlazas;


    //constructores

    public Autobus(){

    }


    public Autobus(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }


    //getters and setters

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
