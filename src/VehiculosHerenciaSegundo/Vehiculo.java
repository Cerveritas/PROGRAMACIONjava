package VehiculosHerenciaSegundo;

public class Vehiculo {


    private int kilometrosRealizados;
    private String matricula;


    public Vehiculo(){

    }


    public Vehiculo(int kilometrosRealizados, String matricula) {
        this.kilometrosRealizados = kilometrosRealizados;
        this.matricula = matricula;
    }


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


    public String showInfo() {
        return "Vehiculo{" +
                "kilometrosRealizados=" + kilometrosRealizados +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
