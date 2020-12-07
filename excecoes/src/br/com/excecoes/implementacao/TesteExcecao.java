package br.com.excecoes.implementacao;

import tratarexcecao.MinhaExcecao;

public class TesteExcecao {
	public static void main(String[] args) {
		/*
		 * Excecoes 
		 * Unchecked´s => DC (Depois da Compilação)
		 * Checked´s => AC (Antes da Compilação)
		 */
		try {
			//abrir a conexao com o banco de dados
			int numero = Integer.parseInt("7");
			if (numero<0) {
				throw new RuntimeException("Ligue para o 9999");
			}
			
			System.out.println("Número:" + numero);
			
			String palavra = "";
			System.out.println("Qtde Caracteres: " + palavra.length());
			
			int[] valores = new int[2];
			valores[0] = 541;
			valores[1] = 82;
			valores[2] = 10;
			

		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Tenha um bom dia de trabalho");
			try {
				// encerrar a conexão com o banco de dados
			}catch(Exception e) {
				System.out.println(MinhaExcecao.tratar(e));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
