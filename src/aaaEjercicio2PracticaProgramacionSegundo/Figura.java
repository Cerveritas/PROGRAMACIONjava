package aaaEjercicio2PracticaProgramacionSegundo;

public abstract class Figura implements IAcciones{

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
