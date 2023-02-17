package MedicosHerenciaSegundo;

import java.util.Arrays;

// CLASE HIJA
public class Podologo extends Medicos{

    // atributos

    private String hospital;
    private int planta;


    // constructores

    public Podologo(){

    }

    public Podologo(String nombre, String apellidos, int numeroColegiado, String hospital, int planta, Paciente[]pacientes) {
        super(nombre, apellidos, numeroColegiado,pacientes);
        this.hospital = hospital;
        this.planta = planta;
    }


    // getters and setters


    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }



    public String showInfo() {
        return "Podologo{" +
                "hospital='" + hospital + '\'' +
                ", planta=" + planta +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", paciente=" + paciente[0].showInfo() + paciente[1].showInfo() + paciente[2].showInfo()+
                "} " ;
    }

    public boolean trabaja (String hospi){
        boolean trabaja = false;
        if (hospi.toLowerCase().equals(hospital.toLowerCase())){
            trabaja = true;
        }
        return trabaja;
    }




}
