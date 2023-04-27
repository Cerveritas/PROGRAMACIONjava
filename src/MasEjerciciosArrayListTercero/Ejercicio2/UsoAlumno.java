package MasEjerciciosArrayListTercero.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class UsoAlumno {
    public static void main(String[] args) {

        // arrayList
        ArrayList<Alumno> listado_alumnos = new ArrayList<>();

        // creamos alumnos

        Alumno a1 = new Alumno("Sergio", 1);
        listado_alumnos.add(a1);
        //otra manera de crear alumno
        listado_alumnos.add(new Alumno("Nahiara", 10));
        listado_alumnos.add(new Alumno("Recarte", 0));


        System.out.println("ORDENACION POR ONDEN ALFABETICO ASCENDENTE");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(listado_alumnos.toString());
                                                                                                                        System.out.println(" ");
        System.out.println("ORDENACION POR ONDEN ALFABETICO DESCENDENTE");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(listado_alumnos.toString());
                                                                                                                        System.out.println(" ");
        System.out.println("ORDENACION POR NOTA ASCENDENTE");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNota));
        System.out.println(listado_alumnos.toString());
                                                                                                                        System.out.println(" ");
        System.out.println("ORDENACION POR NOTA DESCENDENTE");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(listado_alumnos.toString());
                                                                                                                        System.out.println(" ");
        System.out.println("ORDENADOR POR AMBAS");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Comparator.comparing(Alumno::getNota)));
        System.out.println(listado_alumnos.toString());
                                                                                                                        System.out.println(" ");
        System.out.println("ORDENACION POR AMBAS DESCENDENTE");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Comparator.comparing(Alumno::getNota).reversed()));
        System.out.println(listado_alumnos.toString());





















    }
}
