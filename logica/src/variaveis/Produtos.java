package variaveis;

import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto");
		/*
		 * Entre os tipos primitivos inteiros
		 * byte => -128 / +127
		 * short => -32... / +32...
		 * int => -2b... / +2b...
		 * long => -9.... / +9......
		 */
		 short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde"));
		 /*
		  * Entre os tipos primitivos reais
		  * float => pouco precisão nas casas decimais
		  * double => dobro de precisão que o float
		  */
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		// Cast é um conversão entre dados do mesmo tipo, MAS
		// com tamanhos diferentes
		int numero = 10;
		qtde = (short) numero;
		
		
		
		
		
		
		
		
		

	}

}
