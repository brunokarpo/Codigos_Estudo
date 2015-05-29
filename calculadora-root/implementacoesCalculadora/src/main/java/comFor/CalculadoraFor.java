package comFor;

import framework.ICalculadora;

public class CalculadoraFor implements ICalculadora {

	public double calcular(double a, double b) {
		double resultado = 1;

		for(int i = 0; i < b ; i++) {
			resultado *= a;
		}

		return resultado;
	}

}
