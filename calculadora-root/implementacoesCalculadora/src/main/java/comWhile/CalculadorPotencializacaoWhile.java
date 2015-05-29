package comWhile;

import framework.CalculadorPotencializacao;
import framework.ICalculadora;

public class CalculadorPotencializacaoWhile extends CalculadorPotencializacao {

	@Override
	protected ICalculadora getCalculadora() {
		return new CalculadoraWhile();
	}

}
