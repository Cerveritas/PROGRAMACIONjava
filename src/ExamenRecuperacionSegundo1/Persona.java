package ExamenRecuperacionSegundo1;

public class Persona {



    public static final int SOBREPESO = 1;
    public static final int IDEAL = 0;
    public static final int INFRAPESO = -1;





    /** ATRIBUTOS **/

    private String nombre = null;
    private int edad = 0;
    private int DNI;
    private String dni_completo;
    private Sexo sexo = Sexo.H;
    private int peso = 0;
    private int altura = 0;


    /** CONSTRUCTORES **/

    public Persona(){

    }

    public Persona(String nombre, int edad, String sexo) throws EdadIncorrecta, SexoIncorrecto{
        this.nombre = nombre;
        if (edad < 0){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
        if (!Sexo.valueOf(sexo).equals(Sexo.M) || !Sexo.valueOf(sexo).equals(Sexo.M)){
            throw new SexoIncorrecto("El sexo incorrecto no es válido");
        }
        this.sexo = Sexo.valueOf(sexo);
    }

    public Persona(String nombre, int edad, int DNI, String sexo, int peso, int altura) throws EdadIncorrecta, SexoIncorrecto {
        this.nombre = nombre;
        if (edad < 0){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
        this.DNI = DNI;
        this.dni_completo = generarDNI();
        if (!Sexo.valueOf(sexo).equals(Sexo.M) && !Sexo.valueOf(sexo).equals(Sexo.H)){
            throw new SexoIncorrecto("El sexo incorrecto no es válido");
        }
        this.sexo = Sexo.valueOf(sexo);
        this.peso = peso;
        this.altura = altura;
    }




    /** GETTERS AND SETTERS **/

    //getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public String getDni_completo() {
        return dni_completo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws EdadIncorrecta {
        if (edad < 0){
            throw new EdadIncorrecta("No se puede introducir una edad negativa");
        }
        this.edad = edad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
        this.dni_completo = generarDNI();
    }


    public void setSexo(String sexo) throws SexoIncorrecto {
        if (!Sexo.valueOf(sexo).equals(Sexo.M) && !Sexo.valueOf(sexo).equals(Sexo.H)){
            throw new SexoIncorrecto("El sexo introducido no es válido");
        }
        this.sexo = Sexo.valueOf(sexo);
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    /** METODOS **/


    /**
     * @param
     * @return el dni completo con letra
     */
    private String generarDNI() {
        String dni_con_letra = null;
        char letra_supuesta = 0;
        int dni_sin_letra = DNI;

        int resto = dni_sin_letra%23;

        switch (resto){
            case 0: letra_supuesta = 'T';
                break;
            case 1:letra_supuesta = 'R';
                break;
            case 2: letra_supuesta = 'W';
                break;
            case 3: letra_supuesta = 'A';
                break;
            case 4: letra_supuesta = 'G';
                break;
            case 5: letra_supuesta = 'M';
                break;
            case 6: letra_supuesta = 'Y';
                break;
            case 7: letra_supuesta = 'F';
                break;
            case 8: letra_supuesta = 'P';
                break;
            case 9: letra_supuesta = 'D';
                break;
            case 10: letra_supuesta = 'X';
                break;
            case 11: letra_supuesta = 'B';
                break;
            case 12: letra_supuesta = 'N';
                break;
            case 13: letra_supuesta = 'J';
                break;
            case 14: letra_supuesta = 'Z';
                break;
            case 15: letra_supuesta = 'S';
                break;
            case 16: letra_supuesta = 'Q';
                break;
            case 17: letra_supuesta = 'V';
                break;
            case 18: letra_supuesta = 'H';
                break;
            case 19: letra_supuesta = 'L';
                break;
            case 20: letra_supuesta = 'C';
                break;
            case 21: letra_supuesta = 'K';
                break;
            case 22: letra_supuesta = 'E';
                break;
        }
        return String.valueOf(dni_sin_letra)+letra_supuesta;
    }


    /**
     * @paraa no tiene
     * @return si el usuario esta en peso ideal, infrapeso, sobrepeso
     */
    public int calcularIMC(){

        int resultado = 0;

        resultado = (int) (peso/Math.pow(altura,2));

        if (resultado < 20){
            return INFRAPESO;
        } else if (resultado >= 20 && resultado <= 25) {
            return IDEAL;
        } else {
            return SOBREPESO;
        }
    }




    /**
     *
     * @return retornamos si alguien es mayor de edad(TRUE) o menor de edad(FALSE)
     */

    public boolean esMayorEdad(){
        boolean resultado = edad >= 18;


        return resultado;
    }




    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", dni_completo='" + dni_completo + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
