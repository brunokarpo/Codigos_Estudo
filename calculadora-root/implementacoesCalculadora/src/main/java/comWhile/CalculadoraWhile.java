package comWhile;

import framework.ICalculadora;

public class CalculadoraWhile implements ICalculadora {

	public double calcular(double a, double b) {
		int contador = 0;

		double resultado = 1;

		while(contador < b) {
			resultado *= a;
			contador++;
		}

		return resultado;
	}

}
