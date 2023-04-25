package SimulacroExamenTercero;

public abstract class Persona {

    /** ATRIBUTOS **/
    protected String dni;
    protected String nombre;
    protected String apellido1;
    protected int edad;
    protected double altura;
    protected double peso;
    protected double icm;
    protected Categoria estado;


    /** CONSTRUCTOR **/
    public Persona(String dni, String nombre, String apellido1, int edad, double altura, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.icm = calcularICM();
        this.estado = calcularCategoria();
    }


    /** GETTERS AND SETTERS **/

    // getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getIcm() {
        return icm;
    }

    public Categoria getEstado() {
        return estado;
    }

    // setters

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.icm=calcularICM();
        this.estado=calcularCategoria();
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.icm=calcularICM();
        this.estado=calcularCategoria();
    }



    /** METODOS **/
    public abstract Categoria   calcularCategoria();

    public double calcularICM(){
        return peso/Math.pow(altura,2);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", icm=" + icm +
                ", estado=" + estado +
                '}';
    }
}
