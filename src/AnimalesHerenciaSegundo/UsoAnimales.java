package AnimalesHerenciaSegundo;

import java.util.Scanner;

public class UsoAnimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cerdo cerdo = new Cerdo(13, "Bellotas");
        Perro perro = new Perro(3, "Pitbull");
        Gato gato = new Gato(1, "Negro");

        Gato gato2=null;
        System.out.println("Introduce la edad del gato");
        int edad = sc.nextInt();
        System.out.println("EL color del gato");
        String color = sc.next();
        gato2 = new Gato(edad,color);



        Gato gato3 = new Gato();
        gato3.setEdad(edad);
        gato3.setColor(color);







        cerdo.saySomething();
        perro.saySomething();
        gato.saySomething();

        gato2.saySomething();







        System.out.println(cerdo.showInfo());
        System.out.println(perro.showInfo());
        System.out.println(gato.showInfo());

        System.out.println(gato2.showInfo());



    }
}
