package EmpleadosHerenciaSegundo;

public class ProductManager {

    // atributos

    private String NIF;
    private String nombre;
    private String apellidos;
    private int horasTrabajadas;
    private String proyecto;



    // constructores

    public ProductManager(){

    }

    public ProductManager(String NIF,String nombre,String apellidos,int horasTrabajadas,String proyecto){
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;
        this.proyecto = proyecto;
    }

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

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
