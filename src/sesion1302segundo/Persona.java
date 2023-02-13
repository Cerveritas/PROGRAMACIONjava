package sesion1302segundo;

public abstract class Persona {

    protected String dni;
    protected String nombre;
    protected int edad;




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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //como sobrescribir tostring


    public abstract double calcularRetencion();




}
