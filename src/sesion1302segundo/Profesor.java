package sesion1302segundo;

public class Profesor extends Persona{

    private int salario;

    public Profesor(int salario) {
        this.salario = salario;
    }


    public Profesor(String dni, String nombre, int edad, int salario) {
        this.salario = salario;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //como sobrescribir tostring


    @Override
    public String toString(){
        return "Profesor --> DNI"+dni;
    }

    public double calcularRetencion(){
        double  retencion;
        retencion = salario*0.20;
        return retencion;
    }


}


