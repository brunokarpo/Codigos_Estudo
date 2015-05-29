package implementacoesCalculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import comFor.CalculadoraFor;

public class TestarCalculadoraFor {

	private CalculadoraFor calculadora;

	@Before
	public void criarCalculadoraFor() {
		calculadora = new CalculadoraFor();
	}

	@Test
	public void testarCalculadoraUsandoFor() {

		assertEquals(8, calculadora.calcular(2, 3), 0.00001);
		assertEquals(125, calculadora.calcular(5, 3), 0.00001);
		assertEquals(5, calculadora.calcular(5, 1), 0.00001);
		assertEquals(1, calculadora.calcular(245, 0), 0.00001);

	}

}
