package modelo.implementacoesNFe;

import java.util.List;

import modelo.ImpostoInterface;
import modelo.Produto;

public class ImpostoPessoaFisica implements ImpostoInterface {

	private static final double TAXA = 0.07;

	@Override
	public double calcularImposto(List<Produto> produtos) {
		double total = 0;
		for(Produto produto : produtos) {
			total += produto.getValor().doubleValue();
		}
		return total * TAXA;
	}


}
