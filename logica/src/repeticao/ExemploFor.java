package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/* For => próprio para quando não existe interação com o usuário final
		 Sintaxe:
		 1º - definir o contador 
		 2º - qual a condição para manter a repetição
		 3º - qual a forma de contagem
		*/
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=0;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
