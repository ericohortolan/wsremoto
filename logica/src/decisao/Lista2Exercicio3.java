package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		char opcao = JOptionPane.showInputDialog
				("Digite:\n+ Somar\n- Subtrair\n* Multiplicar\n/ Dividir").charAt(0);
		if (opcao=='+') {
			System.out.println("Resultado: " + (valor1+valor2));
		}else if (opcao=='-') {
			System.out.println("Resultado: " + (valor1-valor2));
		}else if (opcao=='*') {
			System.out.println("Resultado: " + (valor1*valor2));
		}else if (opcao=='/') {
			if (valor2!=0) {
				System.out.println("Resultado: " + (valor1/valor2));
			}
		}else {
			System.out.println("Opção inválida");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
