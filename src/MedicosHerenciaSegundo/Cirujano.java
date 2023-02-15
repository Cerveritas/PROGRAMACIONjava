package MedicosHerenciaSegundo;
// CLASE HIJA
public class Cirujano extends Medicos{

    // atributos

    private String hospital;
    private int numeroBox;


    // constructores

    public Cirujano(){

    }

    public Cirujano(String nombre, String apellidos, int numeroColegiado, String hospital, int numeroBox) {
        super(nombre, apellidos, numeroColegiado);
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
}
