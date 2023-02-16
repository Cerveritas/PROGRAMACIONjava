package EmpleadosHerenciaSegundo;

public class DirectorTecnologia {


    // atributos

    private String NIF;
    private String nombre;
    private String apellidos;
    private int horasTrabajadas;


    // constructores

    public DirectorTecnologia(){

    }

    public DirectorTecnologia(String NIF,String nombre, String apellidos,int horasTrabajadas){
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;
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



    // metodos


    public int horasTrabajadas(int cantidad){
        horasTrabajadas=horasTrabajadas+cantidad;
        return cantidad;
    }


    public String showInfo() {
        return "DirectorTecnologia{" +
                "NIF='" + NIF + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }
}


















