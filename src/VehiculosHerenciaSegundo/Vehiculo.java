package VehiculosHerenciaSegundo;

public class Vehiculo {


    // atrinbutos

    protected int kilometrosRealizados;
    protected String matricula;


    // constructores
    public Vehiculo(){

    }

    public Vehiculo(int kilometrosRealizados, String matricula) {
        this.kilometrosRealizados = kilometrosRealizados;
        this.matricula = matricula;
    }


    // getters and setters

    public int getKilometrosRealizados() {
        return kilometrosRealizados;
    }

    public void setKilometrosRealizados(int kilometrosRealizados) {
        this.kilometrosRealizados = kilometrosRealizados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    // metodos


    /*public int totalKilometros(){

    }
*/

}
