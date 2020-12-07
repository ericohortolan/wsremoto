package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		
		String nome="";
		int idade=0;
		int maioresDeIdade=0;
		int qtdePessoas=0;
		int totalIdade=0;
		String nomeExperiente="";
		int idadeExperiente=0;
		String nomeJovem="";
		int idadeJovem=0;
		do {
			
			nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			if (idade>=18) {
				maioresDeIdade++;
			}
			qtdePessoas++;
			totalIdade+=idade; //totalIdade=totalIdade+idade;
			if (idade>idadeExperiente) {
				idadeExperiente=idade;
				nomeExperiente=nome;
			}
			
			if(idade<idadeJovem || qtdePessoas==1) {
				idadeJovem=idade;
				nomeJovem=nome;
			}
			
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "?", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("Qtde de Pessoas Maiores de Idade: " + maioresDeIdade);
		System.out.println("Média de Idades: " + (totalIdade/qtdePessoas));
		System.out.printf("%s é o(a) mais experiente com %d anos.\n", nomeExperiente, idadeExperiente);
		System.out.printf("%s é o(a) mais jovem com %d anos.\n", nomeJovem, idadeJovem);
		
		/*
		float media = totalIdade/qtdePessoas;
		System.out.printf("Média: %.2f\n", media);
		System.out.printf("%s você tem %d anos de idade\n", nome, idade);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
