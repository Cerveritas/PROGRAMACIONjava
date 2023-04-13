package ut7.sesion1304.Tercero;

public class Persona {

    private String DNI;


    public Persona(String DNI) {
        this.DNI = DNI;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                '}';
    }
}
