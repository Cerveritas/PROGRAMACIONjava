package EjerciciosEntornoSergioCerveraJimenez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploProfeObjetos {

    public static void main(String[] args) {


        File archivo = new File("C:\\Users\\34692\\IdeaProjects\\TectFileProject\\src");
        Scanner scanner = null;


        try{
            scanner = new Scanner(archivo);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner != null){
            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                System.out.println("Nombre "+nombre+" , Edad "+edad);
            }
            scanner.close();
        }


    }
}
