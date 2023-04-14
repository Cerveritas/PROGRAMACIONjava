package ExamenRecuperacionSegundoProfe;

public abstract class Persona {

    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String mail;
    protected String fecha_nacimiento;//16-09-1985
    protected int edad;
    protected String nacionalidad;
    protected double n_puntos;


    private int calcularfecha(){
        int anyo_nacimiento= Integer.parseInt(fecha_nacimiento.substring(6,fecha_nacimiento.length()));
        return 2023-anyo_nacimiento;
    }

    public Persona(String dni, String nombre, String apellidos, String nacionalidad, String mail, String fecha_nacimiento) {
        this.dni = dni;
        this.nombre = nombre.toUpperCase();
        this.apellidos = apellidos.toUpperCase();
        this.nacionalidad = nacionalidad.toUpperCase();
        this.mail = mail.toLowerCase();
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad= calcularfecha();
    }
    public abstract double calcularPuntos();

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
        this.nombre = nombre.toUpperCase();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos.toUpperCase();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail.toLowerCase();
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad= calcularfecha();
    }

    public int getEdad() {
        return edad;
    }



    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getN_puntos() {
        return n_puntos;
    }


}
