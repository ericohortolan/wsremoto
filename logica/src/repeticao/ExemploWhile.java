package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.contains("@")==false || email.indexOf("@")<3) {
			email = JOptionPane.showInputDialog("Digite um email com @").toLowerCase();
		}
		
		System.out.println(email);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
