package sesion1701Segundo;

import java.util.Random;

public class EjercicioPractico1 {

    Random rmd = new Random();

    private int numero1= rmd.nextInt();
    private int numero2= rmd.nextInt();



    // get y set del numero 1
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1() {
        this.numero1 = numero1;
    }

    // get y set del numero 2
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2() {
        this.numero2 = numero2;
    }
}


