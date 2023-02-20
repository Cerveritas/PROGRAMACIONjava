package excepcionesSegundo;

import sesion1302segundo.Persona;

import java.util.InputMismatchException;

public class UsoPersonaEJ2 {
    public static void main(String[] args) {

        try {
            PersonaEJ2 persona = new PersonaEJ2("", 778);
        }
        catch (EdadIncorrecta e){
            System.out.println(e.getMessage());
        }




    }
}
