package sesion0303Tercero;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double valorEsperado=200;
        Calculadora calcu = new Calculadora(100,100);
        double resultado = calcu.sumar(100,100);
        assertEquals(valorEsperado,resultado, 0);
    }

    @org.junit.jupiter.api.Test
    void restar() {
        double valorEsperado=50;
        Calculadora calcu = new Calculadora(100,50);
        double resultado = calcu.restar(100,50);
        assertEquals(valorEsperado,resultado, 0);
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        double valorEsperado=100;
        Calculadora calcu = new Calculadora(10,10);
        double resultado = calcu.multiplicar(10,10);
        assertEquals(valorEsperado,resultado, 0);
    }

    @org.junit.jupiter.api.Test
    void divir_ok() {
        double valorEsperado=10;
        Calculadora calcu = new Calculadora(20,2);
        double resultado = calcu.divir(20,2);
        assertEquals(valorEsperado,resultado, 0);
    }

    @org.junit.jupiter.api.Test
    void divir_ko() {

        Calculadora calcu = new Calculadora(20,0);
        Assertions.assertThrows(ArithmeticException.class,()-> calcu.divir(10, 0));
    }


}