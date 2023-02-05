package CosasCasa;

public class Coche {

    private String marca;
    private String color;
    private String tipo;
    private int caballos;
    private int kilometros;



    public Coche(){

    }




    public Coche(String marca, String color, String tipo, int caballos, int kilometros){

        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.caballos = caballos;
        this.kilometros = kilometros;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
