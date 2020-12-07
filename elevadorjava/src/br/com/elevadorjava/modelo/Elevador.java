package br.com.elevadorjava.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	public void descer(short andar) {
		if (andar>=andarMinimo) {
			andarAtual=andar;
		}
	}
	
	public void subir(short andar) {
		if (andar<=andarMaximo) {
			andarAtual=andar;
		}
	}
	
	
	public void sair(byte pQtde) {
		byte resultado = (byte) (qtdeAtual - pQtde);
		if (resultado>=0) {
			qtdeAtual-=pQtde;
		}
	}
	
	public void entrar(byte pQtde) {
		byte total = (byte) (qtdeAtual + pQtde);
		if (total<=capacidadePessoas) {
			qtdeAtual+=pQtde;
		}
		
		
	}
	
	public String exibirDados() {
		return 
				"Elevador........: " + nome + "\n" + 
				"Andar Atual.....: " + andarAtual + "\n" +
				"Qtde de Pessoas.: " + qtdeAtual;
	}
	


	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	
	public void definirValores(String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
