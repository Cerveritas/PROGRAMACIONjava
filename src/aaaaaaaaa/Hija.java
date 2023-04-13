package aaaaaaaaa;

public class Hija extends Padre {



    protected String tipoCoche;
    protected String marca;


    public Hija(){

    }

    public Hija(int puertas, int ruedas, int caballos, String tipoCoche, String marca) {
        super(puertas, ruedas, caballos);
        this.tipoCoche = tipoCoche;
        this.marca = marca;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
