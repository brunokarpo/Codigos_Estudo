import modelo.AbstractNotaFiscal;
import modelo.NotaFiscalBuilder;


public class Principal {

	public static void main(String[] args) {
		AbstractNotaFiscal nota = new NotaFiscalBuilder("fisica")
										.comNumero(1456L)
										.comData("28/05/2015")
										.comProduto("Skate Eletrico", 1, "880")
										.comProduto("Skate de homem", 10, 250.0)
										.construir();

		System.out.println( nota.toString() );

	}
}
