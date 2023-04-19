package EjercicioSetTercero1;

public class Jugador {

    String nombre;
    int edad;
    Posicion posi;


    public Jugador(String nombre, int edad, Posicion posi) {
        this.nombre = nombre;
        this.edad = edad;
        this.posi = posi;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Posicion getPosi() {
        return posi;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosi(Posicion posi) {
        this.posi = posi;
    }
}
