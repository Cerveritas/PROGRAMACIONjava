package Ejercicio2Segundo;

public class Planeta {

    // atributos

    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private Tamanio tamanio;
    private boolean observable;


    //constructor --> Por defecto

    public Planeta(){
        observable = false;

    }

    //constructor --> Parametrizado

    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol, Tamanio tamanio, boolean observable ){
        this.nombre=nombre;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.distanciaSol=distanciaSol;
        this.tamanio=tamanio;
        this.observable=observable;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }
}
