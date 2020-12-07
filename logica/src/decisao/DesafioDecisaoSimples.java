package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String eleitor = JOptionPane.showInputDialog("Seu nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		if (idade <16 ) {
			System.out.println(eleitor + " você não pode votar ainda!");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(eleitor + " você tem que votar!!!");
		}
		
		if (idade==16 || idade==17 || idade>70) {
			System.out.println(eleitor + " o voto pra você é facultativo!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
