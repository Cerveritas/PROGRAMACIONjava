package AnimalesHerenciaSegundo;

public class Gato extends Animal{

    // atributos
    private String color;


    // constructores

    public Gato(){

    }


    public Gato(int edad, String color) {
        this.edad = edad;
        this.color = color;
    }


    // getters and settes

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public void saySomething(){
        System.out.println("Miau");
    }


    public String showInfo() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }
}
