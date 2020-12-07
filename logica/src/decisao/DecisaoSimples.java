package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
		float media = (nota1+nota2)/2;
		if (media>=6) {
			System.out.println(nome + " parabéns você foi aprovado");
		}
		
		if (media<4) {
			System.out.println(nome + " infelizmente você foi reprovado");
		}
		// && = and = e
		// || = or = ou
		// != = not = não é igual
		if (media<6 && media>=4) {
			System.out.println(nome + " você ainda tem chance no exame");
		}
		
		System.out.println("Sua média foi: "  + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
