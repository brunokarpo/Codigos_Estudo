package modelo.implementacoesNFe;

import modelo.AbstractNotaFiscal;
import modelo.ImpostoInterface;

public class NotaFiscalPessoaFisica extends AbstractNotaFiscal {

	@Override
	public ImpostoInterface imposto() {
		return new ImpostoPessoaFisica();
	}

}
