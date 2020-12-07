package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		/*
		 * Crie uma aplicação que receba:
		 * nome da disciplina
		 * nota do primeiro semestre
		 * nota do segundo semestre
		 * calcule e exiba a média aritmética entre as duas notas
		 */
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (nota1+nota2)/2;
		System.out.println("Disciplina: " + disciplina + "\n" + "Média: " + media);

		/*
		 * Regras para identificadores (nome):
		 * 1º-) não começaras com números. Exemplo: 1berto (errado)
		 * 2º-) não usarás palavras reservadas da linguagem. Explo: double (errado)
		 * 3º-) não farás uso de caracteres especiais. Explo: not@ (errado)
		 */
		
		/*
		 * Padrões para identificadores:
		 * - CamelCase => cada palavra em um nome deve ser iniciado com letra maiuscula.
		 * Exemplo: PessoaFisica (Classe) - dataDeNascimento (Variavel)
		 * data_de_nascimento 
		 * - Nomes significativos. Evite: x, y, z, alpha, n1, n2, n3, n345...
		 * - Padrão UML (POO)
		 * 		=> Toda classe deve iniciar com letra Maiuscula
		 * 		=> Toda variavel deve iniciar com letra Minuscula
		 * 		=> Todo metodo pertence à uma classe e deve vir seguido de 
		 * 			parenteses.
		 * xpto => variavel
		 * Xpto => classe 
		 * Xpto.abc() => abc é um método
		 * xpto() => X-Men
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
