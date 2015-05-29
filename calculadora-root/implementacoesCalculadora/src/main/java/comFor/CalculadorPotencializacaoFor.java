package comFor;

import framework.CalculadorPotencializacao;
import framework.ICalculadora;

public class CalculadorPotencializacaoFor extends CalculadorPotencializacao {

	@Override
	protected ICalculadora getCalculadora() {
		return new CalculadoraFor();
	}

}
