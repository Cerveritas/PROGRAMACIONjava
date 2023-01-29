package sesion2311;

enum dia
{lunes,martes,miercoles,jueves,viernes,sabado,domingo}


public class UsoMetodosString {
    public static void main(String[] args) {

        String pais="Francia";
        String pais2="Ecuador";
        String pais3="Marruecos";
        String pais4="España";
        String pais22="ecuador";
        String pais8="";

        //declaracion de variable enumerada
        dia variable_dia = dia.domingo;
        System.out.println(variable_dia);


        //char
        System.out.println("La inicial de este pais es "+pais.charAt(0));
        System.out.println("La letra del pais "+pais.charAt(pais.length()-1));
        System.out.println("Numero de letras "+pais.length());
        System.out.println("El pais en mayusculas "+pais.toUpperCase());
        System.out.println("EL pais en minusculas "+pais.toLowerCase());
        System.out.println("Es igual "+pais2+" y "+pais22+" ? "+ pais2.equals(pais22));
        System.out.println("¿Es igual "+pais2+" y "+pais22+ pais2.compareTo(pais22));

        if (pais2.toLowerCase().compareTo(pais22.toLowerCase())==0)
        {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        if (pais2.compareToIgnoreCase(pais22)==0)
        {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        System.out.println("Es subcadena "+pais3.contains("rru"));
        System.out.println("El suifjo de "+pais4+" es "+pais4.endsWith("ña"));
        System.out.println("Esta vacio el  pais "+pais8+" "+pais8.isEmpty());
        System.out.println(pais4.indexOf("a"));
        System.out.println(pais4.lastIndexOf("a"));

        String animal="perro";
        System.out.println(animal.replace('e','o'));
        System.out.println(animal.substring(0,2));
        System.out.println(animal.startsWith("pe"));

        String pais20=" Qatar ";
        System.out.println(pais20.length());//aqui te dice tal cual las posiciones que hay
        System.out.println(pais20.trim().length());//aqui te dice las posiciones sin contar los espacios






    }
}
