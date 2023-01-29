package sesion2610;

public class mascota {
    //atributos, campos, variables
    //estos siempre tienen que ser privados

    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private int peso;
    private int altura;
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

