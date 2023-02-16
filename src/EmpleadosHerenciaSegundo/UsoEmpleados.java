package EmpleadosHerenciaSegundo;

import java.util.Scanner;

public class UsoEmpleados {
    public static void main(String[] args) {

      /*  DirectorTecnologia director = new DirectorTecnologia("49701125G","Pedro","Perez Ramos",567);
        JefesProyectos jefePro = new JefesProyectos("49701191P","Sergio","Cervera Jimenez",2343,"Google, Android");
        ProductManager proMana = new ProductManager("42658896F", "Nahiara","Zarco",867,"Google");
        Programador pro = new Programador("25866521D", "ALejandro","Rebollo",342,"Java","Google");


                                                                                                                        System.out.println(" ");
        System.out.println(director.showInfo()); // <-- Print de DirectorTecnologia
                                                                                                                        System.out.println(" ");
        System.out.println(jefePro.showInfo()); // <-- Print de JefesPryectos
                                                                                                                        System.out.println(" ");
        System.out.println(proMana.showInfo()); // <-- Print de ProductsManager
                                                                                                                        System.out.println(" ");
        System.out.println(pro.showInfo()); // <-- Print de Programador

        */
        /**********************************************************************************************************************/
        // ESTO ES UNA MANERA DE HACERLO QUE ES RELLENAR TU POR SI SOLO ES CONSTRUCTOR E IMPRIMIRLO A CHOLON
        /**********************************************************************************************************************/


/**********************************************************************************************************************/
/**********************************************************************************************************************/
/**********************************************************************************************************************/

    /*
    Aqui creamos los objetos de cada clase (programador, jefesProyectos, ProductManafer, DirectorTecnologia)
    De esta manera vamos a pedir al usuario los datos de cada empleado
     */

        Scanner sc = new Scanner(System.in);

        Programador pro = new Programador();
        JefesProyectos jefePro = new JefesProyectos();
        ProductManager proMana = new ProductManager();
        DirectorTecnologia direcTecno = new DirectorTecnologia();




/*************************************************PROGRAMADOR**********************************************************/
                                                                                                                        System.out.println(" ");
        System.out.println("EMPECEMOS CON EL EMPLEADO PROGRAMADOR");
                                                                                                                        System.out.println(" ");
        System.out.println("Dime tu NIF: ");
            pro.setNIF(sc.next());
        System.out.println("Escriba su nombre: ");
            pro.setNombre(sc.next());
        System.out.println("Escriba sus apellidos: ");
            pro.setApellidos(sc.next());
        System.out.println("Cuantas horas tiene trabajadas: ");
            pro.setHorasTrabajadas(sc.nextInt());
        System.out.println("Cual es lenguaje de programacion que usted utiliza: ");
            pro.setLengajeProgramacion(sc.next());
        System.out.println("Cual es el proyecto que quiere crear: ");
            pro.setProyecto(sc.next());
                                                                                                                        System.out.println(" ");
/************************************************JEFE DE PROYECTO******************************************************/
                                                                                                                        System.out.println(" ");
        System.out.println("EMPECEMOS CON EL EMPLEADO JEFE DE PROYECTO");
                                                                                                                        System.out.println(" ");
        System.out.println("Dime tu NIF: ");
            jefePro.setNIF(sc.next());
        System.out.println("Escriba su nombre: ");
            jefePro.setNombre(sc.next());
        System.out.println("Escriba sus apellidos: ");
            jefePro.setApellidos(sc.next());
        System.out.println("Cuantas horas tiene trabajadas: ");
            jefePro.setHorasTrabajadas(sc.nextInt());
        System.out.println("Cual es el proyecto que quiere crear: ");
            jefePro.setProyectos(sc.next());
                                                                                                                        System.out.println(" ");
/*************************************************PRODUCT MANAGER******************************************************/
                                                                                                                        System.out.println(" ");
        System.out.println("EMPECEMOS CON EL EMPLEADO PRODUCT MANAGER");
                                                                                                                        System.out.println(" ");
        System.out.println("Dime tu NIF: ");
            proMana.setNIF(sc.next());
        System.out.println("Escriba su nombre: ");
            proMana.setNombre(sc.next());
        System.out.println("Escriba sus apellidos: ");
            proMana.setApellidos(sc.next());
        System.out.println("Cuantas horas tiene trabajadas: ");
            proMana.setHorasTrabajadas(sc.nextInt());
        System.out.println("Cual es el proyecto que quiere crear: ");
            proMana.setProyecto(sc.next());
                                                                                                                        System.out.println(" ");
/*********************************************DIRECTOR DE TECNOLOGIA***************************************************/
                                                                                                                        System.out.println(" ");
        System.out.println("EMPECEMOS CON EL EMPLEADO DIRECTOR DE TECNOLOGIA");
                                                                                                                        System.out.println(" ");
        System.out.println("Dime tu NIF: ");
            proMana.setNIF(sc.next());
        System.out.println("Escriba su nombre: ");
            proMana.setNombre(sc.next());
        System.out.println("Escriba sus apellidos: ");
            proMana.setApellidos(sc.next());
        System.out.println("Cuantas horas tiene trabajadas: ");
            proMana.setHorasTrabajadas(sc.nextInt());
                                                                                                                        System.out.println(" ");
/**********************************************************************************************************************/
/**********************************************************************************************************************/
/**********************************************************************************************************************/


/***************************************************IMPRESIONES********************************************************/


        /*
            Para las impresiones voy a mostrar dos maneras de hacerlas:
                * Con el Get --> De esta manera vamos a ir dato a dato por empleado imprimiento las cosas como deseemos
                * Con el metodo showInfo --> De esta manera nos imprimira todoo directamente en una misma linea

            Con el Get solo haremos este para probar que veais que funciona pero realmente voy a imprimir todos los
            empleados con el metodo showInfo
         */

        System.out.println("Aqui el ejemplo del NIF del empleado Programador");
            System.out.println("El NIF del programador es "+pro.getNIF());
                                                                                                                        System.out.println(" ");


        // ahora ya vamos a hacer todas las impresiones con el metodo creado

        System.out.println("A continuacion mostraremos todos los datos de los empleados con el metodo showInfo");
                                                                                                                        System.out.println(" ");

        // aqui se muestra el showInfo de PROGRAMADOR
        System.out.println(pro.showInfo());

        // aqui se muestra el showInfo de JEFE PROYECTOS
        System.out.println(jefePro.showInfo());

        // aqui se muestra el showInfo de PRODUCT MANAGER
        System.out.println(proMana.showInfo());

        // aqui se muestra el showInfo de DIERCTOR DE TECNOLOGIA
        System.out.println(direcTecno.showInfo());

















    }
}
