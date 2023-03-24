package ExamenRecuperacionSegundo1;

public class main {
    public static void main(String[] args) throws EdadIncorrecta, SexoIncorrecto {

    try {
        //crear tres objetos persona con el construcor de todos los parametros

        Persona persona1 = new Persona("Sofia", 38, 62373891, "M", 52, 1);
        Persona persona2 = new Persona("Sergio", 20, 49701191, "H", 70, 3);
        Persona persona3 = new Persona("Nahiara", 19, 84523148, "M", 60, 2);


        //crear array y guardar los tres objetos creados anteriormente

        Persona[] lista_personas = {persona1, persona2, persona3};

        //recorrer el array e ir llamando al metodo calcularimc

        for (int i = 0; i < lista_personas.length; i++) {
            int valor = lista_personas[i].calcularIMC();
            switch (valor) {
                case 1:
                    System.out.println("Cuidado, estas en sobrepeso");
                    break;
                case 0:
                    System.out.println("Felicidades, estas en el peso ideal");
                    break;
                case -1:
                    System.out.println("Cuidado, estas al borde de la anorexia");
                    break;
            }
        }

        //recorrer el array e ir llamando al metodo es mayor de edad

        for (int i = 0; i < lista_personas.length; i++) {
            boolean valor = lista_personas[i].esMayorEdad();
            if (valor) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        }


        //recorrer el array e ir llamando al metodo sobreescrito ToString

        for (int i = 0; i < lista_personas.length; i++) {
            System.out.println(lista_personas[i].toString());
        }


        //seccion forzar excepciones

            //EdadIncorrecta

                    //en el constructor de esta manera
               //     Persona persona4 = new Persona("Recarte", -4, 74019798, "M", 10, 1);

                    //en el setter de esta manera
              //      persona1.setEdad(-5);


            //SexoIncorrecto

                    //en el constructor de esta manera
                    //Persona persona5 = new Persona("Recarte", 12, 74019798, "L", 10, 1);

                    //en el setter de esta manera
                    //persona1.setSexo("L");




    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
