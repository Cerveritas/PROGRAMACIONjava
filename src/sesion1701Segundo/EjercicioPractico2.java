package sesion1701Segundo;
public class EjercicioPractico2 {

    private String DNI;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Nacionalidad;
    private String Direccion;


    @Override
    public String toString() {
        return "EjercicioPractico2{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public String getDireccion() {
        return Direccion;
    }


    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
}
