package sesion0303Tercero;

public class Calculadora {

    // atributos


    private int num1;
    private int num2;






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


    // constructores

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int sumar(int num1, int num2){
        return num1+num2;
    }

    public int restar(int num1, int num2){
        return num1-num2;
    }
    public int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public int divir(int num1, int num2){

        if (num2 == 0){
            throw new ArithmeticException("divison por 0");
        }
        return num1/num2;
    }
}
