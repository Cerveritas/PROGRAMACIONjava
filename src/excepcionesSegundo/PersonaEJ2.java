package excepcionesSegundo;

public class PersonaEJ2 {

    private String nombre;
    private int edad;

    public PersonaEJ2(String nombre, int edad) throws EdadIncorrecta {
        if (edad<=0 /*|| nombre.isEmpty()/*/){  // <-- LO QUE HAY DENTRO ES OTRA OPCION EN VEZ DE HABER DOS "IF"
            throw new EdadIncorrecta("La edad no puede ser menor o igual a '0'.");
        }
        if (nombre.isEmpty()){
            throw new EdadIncorrecta("No debes dejar el campo nombre vacio");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
