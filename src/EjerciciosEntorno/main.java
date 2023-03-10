package EjerciciosEntorno;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = new ArrayList<>();

// Agregar algunos estudiantes a la lista
        listaEstudiantes.add(new Estudiante("Juan", 20, 'M', 8.5));
        listaEstudiantes.add(new Estudiante("María", 19, 'F', 9.0));
        listaEstudiantes.add(new Estudiante("Pedro", 21, 'M', 7.5));

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println(listaEstudiantes.get(i).getNombre());
        }


        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.getPromedio());
        }



        int i = 0;
        while (i < listaEstudiantes.size()) {
            System.out.println(listaEstudiantes.get(i).getEdad());
            i++;
        }















    }
}
