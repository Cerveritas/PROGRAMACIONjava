package AnimalesHerenciaSegundo;

public class Cerdo extends Animal{


    // atributos
    private String alimentacion;


    // constructores

    public Cerdo(){

    }

    public Cerdo(int edad, String alimentacion) {
        this.edad = edad;
        this.alimentacion = alimentacion;
    }



    // getters and setters

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }




    public void saySomething(){
        System.out.println("oink,oink");

    }



    public String showInfo() {
        return "Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }
}


