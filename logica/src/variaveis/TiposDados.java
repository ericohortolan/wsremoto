package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		
		/*
		 * Numérico: é o tipo de dado que PODE ser utilizado
		 * em uma expressão aritmética ou é quando for um dado
		 * sensível para buscas.
		 * Em Javanês:
		 * => int: se estivermos falando de um número inteiro
		 * => double: se estivermos falando de números reais
		 *   
		 * CEP (no contexto Correios) => 00010009
		 * CPF (no contexto da Rec. Federal)
		 * Número de Matrícula (no contexto de uma faculdade)
		 * 
		 * Alfanumérico: é o tipo de dado que não será
		 * utilizado em cálculos. 
		 * Em Javanês => String
		 * CEP (no contexto DP do Itau) => 00010-009
		 * CPF (no contexto da faculdade)
		 * 
		 */
		// Criar uma variável: <tipo de dado> <nome da variável> = <valor>
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		// Tipos numéricos = tipos primitivos
		//Classes Wrappers: são as classes que apoiam os tipos primitivos
		// Exemplo:
		// Integer => int
		// Double => double
		// Float => float
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		System.out.println("Nome...: " + nome);
		System.out.println("Altura.: " + altura);
		System.out.println("Peso...: " + peso);
		System.out.println("Idade..: " + idade);
		double imc = peso / (altura * altura);
		System.out.println("IMC....: " + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
