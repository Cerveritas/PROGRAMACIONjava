package solucionExamenEjercicio2Segundo;

import jdk.jfr.Description;

public final class Programador {  // <-- Al ser una clase perfecta tiene que ser 'final'


    /** ATRIBUTOS **/

    private String nombre;
    private String dni;
    private double salarioBase;
    private int retencion;
    private double salarioNeto;
    private String lenguaje_programacion;
    private Categoria categoria;


    /** CONSTRUCTORES **/

    // por defecto
    public Programador(){
    }

    // parametrizado
    public Programador(String nombre, String dni, int retencion, String lenguaje_programacion, String categoria) throws DNIInvalido, RetencionIncorrecta {

        this.nombre = nombre.toLowerCase(); // <-- Nombre

        /***********************************************************/

        if (!verificar_dni(dni.toUpperCase())) {
            throw new DNIInvalido("La letra del dni no corresponde con la numeracion");

        }
        this.dni = dni.toUpperCase(); // <-- DNI

        /***********************************************************/

        if (retencion < 0 || retencion > 50) {
            throw new RetencionIncorrecta("la retencion tiene que estar comprendida entre '0' y '50'");
        }
        this.retencion = retencion; // <-- Retencion

        /***********************************************************/

        this.lenguaje_programacion = lenguaje_programacion.toLowerCase(); // <-- lenguaje_programacion

        /***********************************************************/

        try {
            this.categoria = Categoria.valueOf(categoria.toLowerCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("La categoria no es correcta");
        }

        if (Categoria.junior.toString().equals(categoria.toLowerCase())){
            this.salarioBase=18000;
        } else if (Categoria.senior.toString().equals(categoria.toLowerCase())) {
            this.salarioBase=27000;
        }
        else {
            this.salarioBase = 35000;
        }

        /***********************************************************/

        this.salarioNeto = calcularSalarioNeto();
    }


    /** GETTERS AND SETTERS **/

    // getters


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getRetencion() {
        return retencion;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }


    // setters


    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public void setDni(String dni) throws DNIInvalido{

        if (!verificar_dni(dni)){
            throw new DNIInvalido("la letra dek dni no corresponde con la numeracion");
        }
        this.dni = dni.toUpperCase();
    }

    public void setRetencion(int retencion) throws RetencionIncorrecta {
        if (retencion < 0 || retencion > 50) {
            throw new RetencionIncorrecta("la retencion tiene que estar comprendida entre '0' y '50'");
        }
        this.retencion = retencion;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion;
    }

    public void setCategoria(String categoria) throws IllegalArgumentException {
        try {
            this.categoria = Categoria.valueOf(categoria);
        } catch (Exception e) {
            throw new IllegalArgumentException("La categoria no es correcta");
        }
        this.categoria = Categoria.valueOf(categoria.toLowerCase());
    }

    /** METODOS **/
    private boolean verificar_dni(String dni) {
        boolean esvalido = false;

        Integer numero = Integer.parseInt(dni.substring(0,dni.length()-1));
        Integer resto = numero%23;
        char letra_metida = dni.charAt(dni.length()-1);
        char letra_corrrecta = 0;

        switch (resto){
            case 0:
                letra_corrrecta = 'T';
                    break;
            case 1:
                letra_corrrecta = 'R';
                    break;
            case 2:
                letra_corrrecta = 'W';
                    break;
            case 3:
                letra_corrrecta = 'A';
                    break;
            case 4:
                letra_corrrecta = 'G';
                    break;
            case 5:
                letra_corrrecta = 'M';
                    break;
            case 6:
                letra_corrrecta = 'Y';
                    break;
            case 7:
                letra_corrrecta = 'F';
                    break;
            case 8:
                letra_corrrecta = 'P';
                    break;
            case 9:
                letra_corrrecta = 'D';
                    break;
            case 10:
                letra_corrrecta = 'X';
                    break;
            case 11:
                letra_corrrecta = 'B';
                    break;
            case 12:
                letra_corrrecta = 'N';
                    break;
            case 13:
                letra_corrrecta = 'J';
                    break;
            case 14:
                letra_corrrecta = 'Z';
                    break;
            case 15:
                letra_corrrecta = 'S';
                    break;
            case 16:
                letra_corrrecta = 'Q';
                    break;
            case 17:
                letra_corrrecta = 'V';
                break;
            case 18:
                letra_corrrecta = 'H';
                    break;
            case 19:
                letra_corrrecta = 'L';
                    break;
            case 20:
                letra_corrrecta = 'C';
                    break;
            case 21:
                letra_corrrecta = 'K';
                    break;
            case 22:
                letra_corrrecta = 'E';
                    break;
        }
        if (letra_metida == letra_corrrecta){
            esvalido = true;
        }
        return esvalido;
    }

    private double calcularSalarioNeto() {
        return salarioBase-salarioBase*retencion/100;
    }


    @Override
    public String toString() {
        return  "El empleado "+nombre+" con dni "+dni+" con perfil "+categoria+" programando en "+lenguaje_programacion+" " +
                "tiene un salario base de "+salarioBase+" que al aplicarle la retencion de "+retencion+"" +
                "le supone un salario neto de "+salarioNeto;
    }
}
