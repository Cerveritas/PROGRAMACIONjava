package MedicosHerenciaSegundo;
// CLASE HIJA
public class Podologo extends Medicos{

    // atributos

    private String hospital;
    private int planta;


    // constructores

    public Podologo(){

    }

    public Podologo(String nombre, String apellidos, int numeroColegiado, String hospital, int planta) {
        super(nombre, apellidos, numeroColegiado);
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
}
