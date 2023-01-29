package a.b;

public class ConversionPrimitivoWrapper {
    public static void main(String[] args) {


        //declaracion de variable
        Integer a = 6;
        int b = 7;
        int c = 8;
        Integer d = 9;

        System.out.println("el valor de la variable Wrapper a es " + a);
        System.out.println("el valor de la variable de tipo primitivo int b es: " + b);
        System.out.println("el valor de la variable de tipo primitivo int c es: " + c);

        //Vamos a autoboxing

        System.out.println("Autoboxing;");
        a = b;
        System.out.println("La variable wrapper a vale ahora: " + b);

        //Vamos a unboxing
        System.out.println("Unboxing;");
        c = a;
        System.out.println("La variable tipo primitivo int c vale ahora " + c);

        //beneficios de usar clases envoltorios o wrapper
        System.out.println("este metodo permite pasar una variable de tipo integer a string "+a.toString());
        System.out.println("¿es "+a+" igual a b "+b +a.equals(b));
        System.out.println("¿es igual a d "+a.equals(d));
        System.out.println("convertir la variable b en float "+d.floatValue());


    }//fin del main

}//fin de la clase
