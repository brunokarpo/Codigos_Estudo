package modelo.implementacoesNFe;

import java.util.List;

import modelo.ImpostoInterface;
import modelo.Produto;

public class ImpostoPessoaJuridica implements ImpostoInterface {

	private static final double TAXA = 0.04;

	@Override
	public double calcularImposto(List<Produto> produtos) {
		double valor = 0;
		for(Produto produto : produtos) {
			valor += produto.getValor().doubleValue();
		}

		return valor * TAXA;
	}

}
