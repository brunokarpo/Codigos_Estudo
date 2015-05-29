package implementacoesCalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import comWhile.CalculadoraWhile;

public class TestarCalculadoraWhile {

	private CalculadoraWhile calculadora;

	@Before
	public void criarCalculadoraWhile() {
		calculadora = new CalculadoraWhile();
	}

	@Test
	public void testarCalculadoraUsandoWhile() {

		assertEquals(8, calculadora.calcular(2, 3), 0.00001);
		assertEquals(125, calculadora.calcular(5, 3), 0.00001);
		assertEquals(5, calculadora.calcular(5, 1), 0.00001);
		assertEquals(1, calculadora.calcular(245, 0), 0.00001);

	}

}
