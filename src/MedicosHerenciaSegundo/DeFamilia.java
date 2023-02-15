package MedicosHerenciaSegundo;
// CLASE HIJA
public class DeFamilia extends Medicos{

    // atributos

    private String nombreCentroSalud;


    // constructores

    public DeFamilia(){

    }

    public DeFamilia(String nombre, String apellidos, int numeroColegiado, String nombreCentroSalud) {
        super(nombre, apellidos, numeroColegiado);
        this.nombreCentroSalud = nombreCentroSalud;
    }


    // getters and setters


    public String getNombreCentroSalud() {
        return nombreCentroSalud;
    }

    public void setNombreCentroSalud(String nombreCentroSalud) {
        this.nombreCentroSalud = nombreCentroSalud;
    }
}
