package MedicosHerenciaSegundo;

import java.lang.reflect.Array;
import java.util.Arrays;

// CLASE PADRE
public class Medicos extends Paciente{

    // atributos

    protected String nombre;
    protected String apellidos;
    protected int numeroColegiado;

    protected Paciente[] paciente = new Paciente[3];




    // constructores

    public Medicos(){

    }

    public Medicos(String nombre, String apellidos, int numeroColegiado, Paciente[]paciente){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.paciente = paciente;

    }

    // getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public Paciente[] getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente[] paciente) {
        this.paciente = paciente;
    }


    // metodos


    public String showInfo() {
        return "Medicos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", paciente=" + paciente +
                "} " ;
    }

    public boolean trata(){
        boolean resultado = false;

        for (int i = 0; i < paciente.length; i++){
            if (nombre.equals(paciente[i].getNombre())){
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public void pacientes (Paciente [] pacientes){
        for (int i = 0; i < paciente.length; i++){
            System.out.println(paciente[i].toString());
        }
    }
}
