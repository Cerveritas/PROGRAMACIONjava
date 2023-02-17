package MedicosHerenciaSegundo;

import java.util.Arrays;

// CLASE HIJA
public class DeFamilia extends Medicos{

    // atributos

    private String nombreCentroSalud;


    // constructores

    public DeFamilia(){

    }

    public DeFamilia(String nombre, String apellidos, int numeroColegiado, String nombreCentroSalud,Paciente[]pacientes) {
        super(nombre, apellidos, numeroColegiado,pacientes);
        this.nombreCentroSalud = nombreCentroSalud;
    }


    // getters and setters


    public String getNombreCentroSalud() {
        return nombreCentroSalud;
    }

    public void setNombreCentroSalud(String nombreCentroSalud) {
        this.nombreCentroSalud = nombreCentroSalud;
    }

    public String showInfo() {
        return "DeFamilia{" +
                "nombreCentroSalud='" + nombreCentroSalud + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", paciente=" + paciente[0].showInfo() + paciente[1].showInfo() + paciente[2].showInfo()+
                "} " ;
    }
}
