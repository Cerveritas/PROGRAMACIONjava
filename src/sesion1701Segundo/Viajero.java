package sesion1701Segundo;

import java.util.Scanner;

public class Viajero {

    //variable de clase compartida por todos los objetos

    public static int contador;

/**************************************************ATRIBUTOS***********************************************************/

    //atributos

    private String DNI;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Nacionalidad;
    private String Direccion;


/**************************************************CONSTRUCTORES*******************************************************/

    //constructor --> Por defecto

    public Viajero(){
        contador++;

    }


    //constructor --> Parametrizado

    public Viajero(String DNI, String Nombre, String Apellido1, String Apellido2, String Nacionalidad, String Direccion){

        this.DNI = DNI;
        this.Nombre = Nombre;
        this. Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Nacionalidad = Nacionalidad;
        this.Direccion = Direccion;
        contador++;

    }


/**********************************************************************************************************************/

    @Override
    public String toString() {
        return "Viajero{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }


/*************************************************GETTERS AND SETTERS**************************************************/

    //getters and setters

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

/*******************************************************METODOS********************************************************/

    public void getInfo(FormatoViajero modo){

        String entrada="";
        Scanner sc = new Scanner(System.in);
            switch (modo){

                case normal:
                    System.out.println("El DNI del pasajero es "+DNI);
                    System.out.println("El nombre del pasajero es "+Nombre);
                    System.out.println("El primer apellido del pasajero es "+Apellido1);
                    System.out.println("El segundo apellido del pasajero es "+Apellido2);
                    System.out.println("La nacionalidad del pasajero es "+Nacionalidad);
                    System.out.println("La direccion del pasajero es "+Direccion);
                        break;

                case pausado:
                    System.out.println("El DNI del pasajero es "+DNI);
                        entrada = sc.nextLine();
                    System.out.println("El nombre del pasasjero es "+Nombre);
                        entrada = sc.nextLine();
                    System.out.println("El primer apellido del pasajero es "+Apellido1);
                        entrada = sc.nextLine();
                    System.out.println("El segundo apellido del pasajero es "+Apellido2);
                        entrada = sc.nextLine();
                    System.out.println("La nacionalidad del pasajero es "+Nacionalidad);
                        entrada = sc.nextLine();
                    System.out.println("La direccion del pasajero es "+Direccion);
                        break;
        }



    }
}
