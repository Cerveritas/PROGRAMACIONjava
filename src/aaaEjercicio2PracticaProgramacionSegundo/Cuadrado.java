package aaaEjercicio2PracticaProgramacionSegundo;

public class Cuadrado extends Figura{


    // ATRIBUTOS.
    private int lado;


    // CONSTRUCTORES

    public Cuadrado(){

    }


    public Cuadrado(int lado) {
        this.lado = lado;
    }


    // GETTER AND SETTER

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    public double area(int lado){
        int area=0;

            area = lado * lado;

        return area;
    }


    public void volumen(){
        System.out.println(
                "No se puede calcular el volumen de un cuadrado \n" +
                "ya que para que tenga volumen deberia ser un cubo.");
    }


}
