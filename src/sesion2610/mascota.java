package sesion2610;

public class mascota {
    //atributos, campos, variables
    //estos siempre tienen que ser privados

    private final String nombre;
    private int edad;
    private final String raza;
    private final String color;
    private final int peso;
    private final int altura;
    private char genero;

    //metodos
    //normalmente publica

    public mascota()
    {
        nombre="default";
        edad=0;
        raza="default";
        color="default";
        peso=0;
        altura=0;
        genero= 'd';
    }

    public char getGenero() //esto es una funcion (devuelve en este caso un "char")
    {
        return genero;
    }

    public void setGenero(char genero) //esto es un procedimiento (no devuelve nada)
    {
        this.genero = genero;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

