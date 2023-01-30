package sesion3001Segundo;

public class Pelota {

    float peso;
    String tipo;
    int presion;
    String color;
    String marca;


    Pelota(){
        marca="Adidas";
        tipo="Futbol";
        color="Blanco";
        peso=1;
        presion=3;
    }



    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }





}
