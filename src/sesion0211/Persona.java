package sesion0211;

import java.time.LocalDate;

public class Persona {

    //año actual
    LocalDate current_date = LocalDate.now();
    final int anyo_actual = current_date.getYear();
    //propiedades
    public String nombre;
    public int edad;
    public String anyo_nacimiento;
    //metodos
    public  String obtenerAnyo(int edad)
    {
        String anyo;
        anyo = String.valueOf(anyo_actual -edad);
        return anyo;
    }
}
