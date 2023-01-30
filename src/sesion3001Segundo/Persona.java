package sesion3001Segundo;

public class Persona {
    public static int contador=0;
    //atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    //métodos
    Persona(){
        contador++;
    }
    Persona(String nombre,String dni,String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
        contador=contador+1;

    }
    public int getContador(){
        return contador;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
