package VehiculosHerenciaSegundo;

public class Moto extends Vehiculo{

    private int cilindrada;


    public Moto(){

    }


    public Moto(int kilometrosRealizados, String matricula, int cilindrada) {
        super(kilometrosRealizados, matricula);
        this.cilindrada = cilindrada;
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
