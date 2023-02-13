package sesion1302segundo;

public class UsoHerenciasPersonas {
    public static void main(String[] args) {


                                                                                                                        System.out.println(" ");

        Profesor pro = new Profesor("497801191P","Sergio",19,230400);

        System.out.println("EL profesor tiene el dni "+pro.getDni());
        System.out.println("Con nombre "+pro.getNombre());
        System.out.println("Con la edad de "+pro.getEdad());
        System.out.println("Tiene un salario de "+pro.getSalario()+" €");
        System.out.println("El ToString de profesor es "+pro.toString());






    }
}
