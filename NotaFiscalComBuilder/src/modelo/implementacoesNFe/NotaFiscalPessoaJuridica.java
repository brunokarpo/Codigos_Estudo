package modelo.implementacoesNFe;

import modelo.AbstractNotaFiscal;
import modelo.ImpostoInterface;

public class NotaFiscalPessoaJuridica extends AbstractNotaFiscal {

	@Override
	public ImpostoInterface imposto() {
		return new ImpostoPessoaJuridica();
	}

}
