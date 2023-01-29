package sesion0901Segundo;

public class Persona {

    //atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

            // la inicializacion de las variables se puede hacer tanto
            // en los atributos como en los metodos

    //metodos

    public Persona(){
        apellidos="Cervera";

    }

    //get y set de DNI
    public String getDni(){
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    //get y set de NOmbre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //get y set de Apellidos
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //get y set de edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
