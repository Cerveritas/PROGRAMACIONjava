package sesion0303Tercero;

public class CalculadoraParametrizel {

    private int num1;
    private int num2;

    public CalculadoraParametrizel(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int suma(int num1, int num2, int valoresperado){
        valoresperado = num1+num2;
        return valoresperado;
    }


















}
