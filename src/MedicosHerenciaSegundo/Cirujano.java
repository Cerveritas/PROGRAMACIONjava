package MedicosHerenciaSegundo;

import java.util.Arrays;

// CLASE HIJA
public class Cirujano extends Medicos{

    // atributos

    private String hospital;
    private int numeroBox;


    // constructores

    public Cirujano(){

    }

    public Cirujano(String nombre, String apellidos, int numeroColegiado, String hospital, int numeroBox, Paciente[]pacientes) {
        super(nombre, apellidos, numeroColegiado,pacientes);
        this.hospital = hospital;
        this.numeroBox = numeroBox;
    }


    // getters and setters

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumeroBox() {
        return numeroBox;
    }

    public void setNumeroBox(int numeroBox) {
        this.numeroBox = numeroBox;
    }


    public String showInfo() {
        return "Cirujano{" +
                "hospital='" + hospital + '\'' +
                ", numeroBox=" + numeroBox +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", paciente=" +  paciente[0].showInfo()+ paciente[1].showInfo()+paciente[2].showInfo()+
                "} " ;
    }

    public boolean trabaja (String hospi){
        boolean trabaja = hospi.equalsIgnoreCase(hospital);
        return trabaja;
    }
}
