package MedicosHerenciaSegundo;
// CLASE PADRE
public class Medicos {

    // atributos

    private String nombre;
    private String apellidos;
    private int numeroColegiado;
    //array de paciente


    // constructores

    public Medicos(){

    }

    public Medicos(String nombre,String apellidos, int numeroColegiado){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
    }

    // getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
