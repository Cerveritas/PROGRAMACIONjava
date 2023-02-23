package SimulacroExamenArboleda;

public class vehiculo_de_combustion extends Vehiculo {

    // ATRIBUTOS
    private String tipo_fosil;
    private boolean viscosidad;

    /*****************************************************************************************************************/


    // CONSTRUCTORES

    public vehiculo_de_combustion(){

    }

    public vehiculo_de_combustion(int bastidor, String matricula, String marca, String modelo, int fechaFabricacion, int edadVehiculo, int kilometrosRealizados, int numeroPuertas, int potenciaMotor, String color, int consumo, boolean estadoVehiculo, String tipo_fosil, boolean viscosidad) {
        super(bastidor, matricula, marca, modelo, fechaFabricacion, edadVehiculo, kilometrosRealizados, numeroPuertas, potenciaMotor, color, consumo, estadoVehiculo);
        this.tipo_fosil = tipo_fosil;
        this.viscosidad = viscosidad;
    }

    /*****************************************************************************************************************/

    // GETTERS

    public String getTipo_fosil() {
        return tipo_fosil;
    }

    public boolean isViscosidad() {
        return viscosidad;
    }



    // SETTERS

    public void setTipo_fosil(String tipo_fosil) {
        this.tipo_fosil = tipo_fosil;
    }



    /*****************************************************************************************************************/


    // TODOS


























}
