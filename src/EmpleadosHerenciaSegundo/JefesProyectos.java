package EmpleadosHerenciaSegundo;

public class JefesProyectos {

    // atributos

    private String NIF;
    private String nombre;
    private String apellidos;
    private int horasTrabajadas;
    private boolean proyectos;


    // constructores

    public JefesProyectos(){

    }

    public JefesProyectos(String NIF,String nombre, String apellidos, int horasTrabajadas,boolean proyectos){
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;
        this.proyectos = proyectos;
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

    public boolean isProyectos() {
        return proyectos;
    }

    public void setProyectos(boolean proyectos) {
        this.proyectos = proyectos;
    }
}