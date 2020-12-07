package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Solicite o nome de um produto, qtde (unitário) e valor.
		 * Sua aplicação deve retornar 
		 * "Estoque Alto" - "Estoque Baixo" - "Estoque Normal"
		 * O estoque normal quando a qtde está entre 10 e 20.
		 * Se o valor for maior que 1000 deve aparecer "Valor Alto".
		 */
		
		String produto = JOptionPane.showInputDialog("Nome do produto").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		
		if (qtde>20) {
			System.out.println("Estoque Alto");
		}else if (qtde<10) {
			System.out.println("Estoque Baixo");
		}else {
			System.out.println("Estoque Normal");
		}
		
		if (valor>1000) {
			System.out.println("Valor Alto");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
