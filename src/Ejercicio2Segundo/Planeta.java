package Ejercicio2Segundo;

import java.util.Scanner;

public class Planeta {

    // variable de clase compartida por todos los objetos

    public static int contador=0;


/**************************************************ATRIBUTOS***********************************************************/

    // atributos

    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private Tamanio tamanio;
    private boolean observable;

/************************************************CONSTRUCTORES*********************************************************/

    //constructor --> Por defecto

    public Planeta(){
        observable = false;
        contador++;

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
        contador++;


    }

/**************************************************METODOS**************************************************************/

    //metodo calcular densidad

    public double calcularDensidad(){
        double resultado=0;
        resultado=masa/volumen;
        return resultado;
    }

    //metodo esplanetaexterior

    public boolean esPlanetaExterior(){
        boolean esExterior=false;
        float limite = (float) (14597870*3.4);

        if (distanciaSol>limite){
            esExterior = true;
        }
        return esExterior;
    }



/**********************************************************************************************************************/

    /*polimorfismo de sobrescritutra de metodos tmb tienes la manera de hacerlo con
        metodo imprimir y usar prints
        o la mejor manera que es usar el ToString*/

       public void imprimir(){
            System.out.println("El nombre del planeta "+this.nombre);
            System.out.println("La cantidad de satelites es "+this.satelites);
            System.out.println("La masa del planeta ed "+this.masa);
            System.out.println("El volumen es "+this.volumen);
            System.out.println("Eteceters");
        }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", satelites=" + satelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", tamanio=" + tamanio +
                ", observable=" + observable +
                '}';
    }

/************************************************GETTERS Y SETTERS*****************************************************/

    //getters and setters

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
