package EjercicioSetTercero1;

public class Jugador {

    String nombre;
    int edad;
    Posicion posi;


    public Jugador(String nombre, int edad, String posi) {
        this.nombre = nombre;
        this.edad = edad;
        this.posi = Posicion.valueOf(posi);
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

    public void setPosi(String posi) {
        this.posi = Posicion.valueOf(posi);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posi=" + posi +
                '}';
    }
}
