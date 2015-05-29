package modelo;

import java.math.BigDecimal;
import java.util.Date;

import modelo.implementacoesNFe.NotaFiscalPessoaFisica;
import modelo.implementacoesNFe.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {

	private AbstractNotaFiscal instancia;

	public NotaFiscalBuilder(String tipo) {
		if(tipo.equalsIgnoreCase("fisica")) {
			instancia = new NotaFiscalPessoaFisica();
		} else if(tipo.equalsIgnoreCase("juridica")) {
			instancia = new NotaFiscalPessoaJuridica();
		}
	}

	public NotaFiscalBuilder comNumero(String numero) {
		instancia.setNumero(Long.parseLong(numero));
		return this;
	}

	public NotaFiscalBuilder comNumero(Long numero) {
		instancia.setNumero(numero);
		return this;
	}

	@SuppressWarnings("deprecation")
	public NotaFiscalBuilder comData(String dataString) {

		String[] dataSeparadaStrings = dataString.split("/");
		Date data = new Date();

		data.setDate(Integer.parseInt(dataSeparadaStrings[0]));
		data.setMonth(Integer.parseInt( dataSeparadaStrings[1]) );
		data.setYear(Integer.parseInt( dataSeparadaStrings[2] ));

		instancia.setDataEmissao(data);

		return this;
	}

	public NotaFiscalBuilder comData(Date data) {
		instancia.setDataEmissao(data);
		return this;
	}

	public NotaFiscalBuilder comProduto(String nome, double quantidade, String valor) {
		Produto produto = criarProduto(nome, quantidade, Double.parseDouble(valor) );
		instancia.setProduto(produto);
		return this;
	}

	public NotaFiscalBuilder comProduto(String nome, double quantidade, Double valor) {
		Produto produto = criarProduto(nome, quantidade, valor );
		instancia.setProduto(produto);
		return this;
	}


	private Produto criarProduto(String nome, double quantidade, double valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(new BigDecimal(valor));

		return produto;
	}

	public AbstractNotaFiscal construir() {
		return instancia;
	}

}
