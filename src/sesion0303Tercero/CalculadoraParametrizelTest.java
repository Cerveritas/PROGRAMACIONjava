package sesion0303Tercero;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraParametrizelTest {

    @ParameterizedTest
    @CsvSource({"20,5,25","10,5,10"})  // <-- El segunda esta incorrecta aposta
    void suma(int a, int b, int valorEsperado) {
        CalculadoraParametrizel calcu1 = new CalculadoraParametrizel(a,b);
        double valorEjecutado = calcu1.suma(a,b,valorEsperado);
        assertEquals(valorEsperado,valorEjecutado,0);
    }
}