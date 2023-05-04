package MasEjerciciosArrayListTerceroo.Ejercicio3;

import java.util.Comparator;

public class Persona {

    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private char sexo;
    private int edad;
    private double peso;


    public Persona(String dni, String nombre, String apellido1, String apellido2, char sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }


    public void sort(Comparator<Persona> thenComparing) {
    }

    public void remove(Persona p) {
    }
}
