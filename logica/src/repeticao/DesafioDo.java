package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		/*
		 * Game: advinhação
		 * Jogador1 : vai digitar um número inteiro
		 * Jogador2 : vai ter que advinhar o numero.
		 * Quando o Jogador 2 acertar, tem que mostrar "Parabéns"
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplicação. Se o Jogador 2 estiver
		 * chutando alto, avise que o número é mais baixo e vice-versa.
		 * 
		 * - Quando o Jogador2 acertar, apresente a quantidade de tentativas que 
		 * ele utilizou.
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				System.out.println("O número é maior!!!!");
			}else if(numero<chute) {
				System.out.println("O número é menor!!!!");
			}
		}while (numero!=chute);
		
		System.out.println("Parabéns!!!! \nVocê acertou com " + contador + " tentativa(s)!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
