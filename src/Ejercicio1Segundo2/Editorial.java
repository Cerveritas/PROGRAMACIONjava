package Ejercicio1Segundo2;

public class Editorial {


    //atributos

    private int codigo;
    private String nombre;
    private int anioEditorial;


    //constructor por defecto
    public Editorial() {

    }


    //constructor parametrizado
    public Editorial(int codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioEditorial = anio;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioEditorial() {
        return anioEditorial;
    }

    public void setAnioEditorial(int anioEditorial) {
        this.anioEditorial = anioEditorial;
    }
}