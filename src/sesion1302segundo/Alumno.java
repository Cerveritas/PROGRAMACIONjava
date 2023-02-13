package sesion1302segundo;

public class Alumno extends Persona{

    private int beca;

    public Alumno(String dni, String nombre, int edad, int beca) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.beca = beca;
    }

    public Alumno(int beca) {
        this.beca = beca;
    }



    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }


    //como sobrescribir tostring


    @Override
    public String toString() {
        return "dni"+dni+"";
    }

    public double calcularRetencion(){
        double  retencion;
        retencion = beca*0.20;
        return retencion;
    }
}
