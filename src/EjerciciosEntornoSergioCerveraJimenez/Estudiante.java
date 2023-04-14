package EjerciciosEntornoSergioCerveraJimenez;

public class Estudiante {
    private final String nombre;
    private final int edad;
    private final char genero;
    private final double promedio;

    public Estudiante(String nombre, int edad, char genero, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", promedio=" + promedio +
                '}';
    }
}
