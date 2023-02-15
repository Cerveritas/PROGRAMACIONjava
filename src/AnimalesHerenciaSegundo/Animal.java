package AnimalesHerenciaSegundo;

public abstract class Animal {

    // atributos
    protected int edad;


    // constructores
    /*public Animal(){

    }


    public Animal(int edad) {
        this.edad = edad;
    }
*/



    // getters and setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    // metodos

    public abstract void saySomething();
}
