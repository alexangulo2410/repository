package SuiteClases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class CalculadoraTest2 {
@ParameterizedTest
@CsvSource({
"2, 3, 5",
"10, 10, 20",
"10, 20, 30"
})
void testSuma(int a, int b, int valorEsperado) {
Calculadora calcu = new Calculadora(a, b);
double resultado = calcu.suma();
assertEquals(valorEsperado, resultado, 0);
}
@ParameterizedTest
@CsvSource({
"2, 1, 1",
"10, 5 , 5",
"20, 10, 10"
})
void testResta(int a, int b, int valorEsperado) {
Calculadora calcu = new Calculadora(a, b);
double resultado = calcu.resta();
assertEquals(valorEsperado, resultado, 0);
}
@ParameterizedTest
@CsvSource({
"2, 2, 4",
"2, 5, 10",
"3, 5, 15"
})
void testMultiplica(int a, int b, int valorEsperado) {
Calculadora calcu = new Calculadora(a, b);
double resultado = calcu.multiplica();
assertEquals(valorEsperado, resultado, 0);
}
}
