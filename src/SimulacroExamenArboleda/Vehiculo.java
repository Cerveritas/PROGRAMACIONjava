package SimulacroExamenArboleda;



public class Vehiculo {

    // ATRIBUTOS

    protected static int contador = 0;
    protected int bastidor;
    protected String matricula;
    protected marca marca;
    protected String modelo;
    protected int fechaFabricacion;
    protected int edadVehiculo;
    protected int kilometrosRealizados;
    protected int numeroPuertas;
    protected int potenciaMotor;
    protected String color;
    protected int consumo;
    protected boolean estadoVehiculo = false;


    /*************************************************************************************************************************************************************************************************************************************************/

    // CONSTRUCTORES
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String marca, String modelo, int fechaFabricacion, int numeroPuertas, int potenciaMotor, String color) {
        this.bastidor = contador++;
        this.matricula = matricula.toUpperCase();
        this.marca = SimulacroExamenArboleda.marca.valueOf(marca.toUpperCase());
        this.modelo = modelo.toLowerCase();
        this.fechaFabricacion = fechaFabricacion;
       /* this.edadVehiculo = calcular_edad();*/
        this.numeroPuertas = numeroPuertas;
        this.potenciaMotor = potenciaMotor;
        this.color = color;
    }

    /********************************************************************************************************************************************************************************************************/

    // GETTERS
    public int getBastidor() {
        return bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public SimulacroExamenArboleda.marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getEdadVehiculo() {
        return edadVehiculo;
    }

    public int getKilometrosRealizados() {
        return kilometrosRealizados;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public String getColor() {
        return color;
    }

    public int getConsumo() {
        return consumo;
    }

    public boolean isEstadoVehiculo() {
        return estadoVehiculo;
    }


    //SETTERS


    /**********************************************************************************************/

    // METODOS

    /*private boolean esta(String marca) {
        boolean esta = false;

    }

*/

    public int calcularKMS() {
        int kms_realizados=0;
        if(edadVehiculo>0){
            kms_realizados=edadVehiculo*kilometrosRealizados;
        }
        return kms_realizados;

    }



 /*  public int calcular_edad(){



    }
*/

    @Override
    public String toString() {
        return "Vehiculo{" +
                "bastidor=" + bastidor +
                ", matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", edadVehiculo=" + edadVehiculo +
                ", kilometrosRealizados=" + kilometrosRealizados +
                ", numeroPuertas=" + numeroPuertas +
                ", potenciaMotor=" + potenciaMotor +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", estadoVehiculo=" + estadoVehiculo +
                '}';
    }


}



















