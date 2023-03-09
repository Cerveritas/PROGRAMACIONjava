package solucionExamenEjercicio2Segundo;

public class main {
    public static void main(String[] args) throws RetencionIncorrecta, DNIInvalido {

    try {
        // crear programadores

        Programador programador1 = new Programador("Pepe", "44707052C", 25, "Java", "JUNIOR");
        Programador programador2 = new Programador("Sergio", "49701191P", 12, "C#", "SENIOR");
        Programador programador3 = new Programador("Nahiara", "32467365J", 0, "Pascal", "Jefe_proyecto");
        /** FORZAR EXCEPCIONES **/
/*
        // 1) IllegalArgument
        Programador programador4 = new Programador("Nahiara", "32467365J", 0, "Pascal", "Jefeproyecto");


        // 2) DNI invalido
        Programador programador5 = new Programador("Nahiara", "32467678677677365J", 0, "Pascal", "Jefe_proyecto");


        // 3) Retencion Invalida
        Programador programador6 = new Programador("Nahiara", "32467365J", 60, "Pascal", "Jefe_proyecto");

*/
        // crear array de programadores

        /*Programador[] lista_empleado = new Programador[4];     */  /* <-- Una opcion */
        Programador[] lista_empleado = {programador1, programador2, programador3};


        // asignar el array

        /*lista_empleado[0] = programador1;
        lista_empleado[1] = programador2;
        lista_empleado[2] = programador3;*/

        /** OTRA OPCION DE DECLARAR LE ARRAY DIRECTAMENTE YA CON LOS DATOS ASIGNADOS A CADA PROGRAMADOR **/
        /*lista_empleado[0] = new Programador("Nahiara", "32467365J", 0, "Pascal", "Jefe_proyecto");*/


        // recorrer e imprimir el array

        for (int i = 0; i < lista_empleado.length; i++) {
            System.out.println(lista_empleado[i].toString());
        }
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
}
