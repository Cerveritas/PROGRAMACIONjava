package a.b;

import java.util.stream.StreamSupport;

public class ConversionExplicita {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Convertir un integer a byte demanera explicita");
        b = (byte) i;
        System.out.println("i=" +i+"b= "+b);

        System.out.println("convertir un double a byte de manera explicita");
        b = (byte) d;
        System.out.println("d= "+d+" b="+b);



    }


}
