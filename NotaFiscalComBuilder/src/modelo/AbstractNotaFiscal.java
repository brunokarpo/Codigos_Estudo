package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class AbstractNotaFiscal {

	private long numero;
	private Date dataEmissao;
	private List<Produto> produtos = new ArrayList<Produto>();
	private ImpostoInterface imposto;

	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}
	/**
	 * @return the dataEmissao
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}
	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	/**
	 * @return the produtos
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}
	/**
	 * Adiciona um produto na lista existente;
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		getProdutos().add(produto);
	}

	public abstract ImpostoInterface imposto() ;

	public double valorImposto() {
		return imposto().calcularImposto( getProdutos() );
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AbstractNotaFiscal [numero = " + numero);
		sb.append(", dataEmissao = " + dataEmissao);
		sb.append(", produtos = [ " );
		for(Produto produto : produtos) {
			sb.append( produto );
		}
		sb.append("] , imposto = " + valorImposto() + "]");

		return sb.toString();
	}


}
