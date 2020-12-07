package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias"));
		float taxa = (float) 5.5;
		if (diarias == 15) {
			taxa = 6;
		} else if (diarias<15) {
			taxa = 8;
		}
		System.out.println("Total: " + ((80+taxa) * diarias));		
		
		/*
		char resposta = JOptionPane.showInputDialog("Digite um operador").charAt(0);
		if (resposta == '+') {
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
