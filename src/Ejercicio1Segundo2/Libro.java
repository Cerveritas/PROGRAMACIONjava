package Ejercicio1Segundo2;

public class Libro {


    //atributos

    private String isbn;
    private String titulo;
    private int anio;
    private int precio;
    private Editorial editorial;



    //constructor --> El de por defecto
    public Libro(){

    }


    //contructor --> El parametrizado
    public Libro(String isbn, String titulo, int anio, int precio, Editorial editorial){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anio=anio;
        this.precio=precio;
        this.editorial=editorial;

    }

    // getter and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
