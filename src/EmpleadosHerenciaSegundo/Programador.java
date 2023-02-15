package EmpleadosHerenciaSegundo;

public class Programador {

    // atributos

    private String NIF;
    private String nombre;
    private String apellidos;
    private int horasTrabajadas;
    private boolean lengajeProgramacion;
    private String proyecto;


    // constructores

    public Programador(){

    }

    public Programador(String NIF, String nombre, String apellidos, int horasTrabajadas, boolean lengajeProgramacion, String proyecto) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;
        this.lengajeProgramacion = lengajeProgramacion;
        this.proyecto = proyecto;
    }


    // getters and setters


    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

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

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public boolean isLengajeProgramacion() {
        return lengajeProgramacion;
    }

    public void setLengajeProgramacion(boolean lengajeProgramacion) {
        this.lengajeProgramacion = lengajeProgramacion;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
