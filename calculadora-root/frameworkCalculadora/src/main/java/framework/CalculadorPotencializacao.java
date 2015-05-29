package framework;


/**
 * @author bruno nogueira
 *
 * Provê o método de calculo, independente da implementação;
 *
 */
public abstract class CalculadorPotencializacao {

	protected abstract ICalculadora getCalculadora();

	public double potencializar(double a, double b) {

		double resultado = getCalculadora().calcular(a, b);

		return resultado;
	}

}
