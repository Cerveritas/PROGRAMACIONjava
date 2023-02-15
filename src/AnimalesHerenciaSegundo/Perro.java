package AnimalesHerenciaSegundo;

import java.util.Scanner;

public class Perro extends Animal{

    // atributos
    private String raza;


    // constructores

    public Perro(){

    }

    public Perro(int edad, String raza) {
        this.edad = edad;
        this.raza = raza;
    }



    // getters and setters

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



    // metodo

    public  void saySomething(){
        System.out.println("Guau Guau");
    }


    public String showInfo() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                "} "; /*+ super.toString(); Se quita para que no salga direccion de memoria      */
    }
}
