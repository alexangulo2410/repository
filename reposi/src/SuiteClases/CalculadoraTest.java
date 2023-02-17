package SuiteClases;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testresta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();

		assertEquals(valorEsperado, resultado, 0);

	}

	@Test
	public void testDivide2() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu. divide ();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	void testResta2() {
		
		Calculadora calc = new Calculadora(2, 6);
		assertFalse(calc.resta2());
		
		Calculadora calc2 = new Calculadora (2, 6);
		assertTrue(calc2.resta2());
		
}
	
	
	
	
	
	
}
