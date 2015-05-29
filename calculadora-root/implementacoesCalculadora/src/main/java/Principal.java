import javax.swing.JOptionPane;

import comFor.CalculadorPotencializacaoFor;
import comWhile.CalculadorPotencializacaoWhile;
import framework.CalculadorPotencializacao;


public class Principal {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Agora o bicho vai pegar");

		boolean valido = false;
		int base = 0;
		int expoente = 0;

		do {
			String baseString = JOptionPane.showInputDialog("Informe a base");
			try {
				base = Integer.parseInt(baseString);

				valido = true;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Eu falei para você digitar um número!");
			}
		} while(!valido);

		valido = false;

		do {
			String expoenteString = JOptionPane.showInputDialog("Informe o expoente");
			try {
				expoente = Integer.parseInt(expoenteString);

				valido = true;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Eu falei para você digitar um número!");
			}
		} while(!valido);

		CalculadorPotencializacao calculadora = new CalculadorPotencializacaoFor();
		double resultado = calculadora.potencializar(base, expoente);

		JOptionPane.showMessageDialog(null, "O resultado da operação " + base + " elevado a " + expoente + " = " + resultado);

	}

}
