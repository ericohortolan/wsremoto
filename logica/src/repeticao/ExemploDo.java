package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String cargo = "";
		float salario=0;
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
			JOptionPane.showMessageDialog(null, "Valor hora: " + (salario/160));
		}while(JOptionPane.showConfirmDialog(
				null,
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION)==0);
		
		
		/*
		char resposta='1';
		while (resposta=='1') {
			String cargo = JOptionPane.showInputDialog("Cargo");
			float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
			resposta = JOptionPane.showInputDialog("Digite <1> para continuar").charAt(0);			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
