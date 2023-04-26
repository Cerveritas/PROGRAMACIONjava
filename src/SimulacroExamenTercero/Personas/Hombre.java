package SimulacroExamenTercero.Personas;

import SimulacroExamenTercero.Personas.Categoria;
import SimulacroExamenTercero.Personas.Persona;

public class Hombre extends Persona {

    /** ATRIBUTOS **/
    private boolean barba;


    /** CONSTRUCTOR **/
    public Hombre(String dni, String nombre, String apellido1, int edad, double altura, double peso, boolean barba) {
        super(dni, nombre, apellido1, edad, altura, peso);
        this.barba = barba;
    }

    /** GETTERS AND SETTERS **/

    // getters
    public boolean isBarba() {
        return barba;
    }

    // setters
    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    /** METODOS **/
    public Categoria calcularCategoria() {
        Categoria cat = null;

        if (icm < 20){
            cat = Categoria.ANOREXIA;
        } else if (icm >= 20 && icm < 26.5) {
            cat = Categoria.IDEAL;
        } else {
            cat = Categoria.SOBREPESO;
        }
        return cat;
    }
}
