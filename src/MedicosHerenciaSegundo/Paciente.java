package MedicosHerenciaSegundo;
// CLASE PACIENTE
public class Paciente {

    // atributos

    private String nombre;
    private String apellidos;
    private int edad;
    private String enfermedad;


    // constructores

    public Paciente(){

    }

    public Paciente(String nombre,String apellidos, int edad, String enfermedad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.enfermedad = enfermedad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }


    public String showInfo() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", enfermedad='" + enfermedad + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", enfermedad='" + enfermedad + '\'' +
                '}';
    }
}
