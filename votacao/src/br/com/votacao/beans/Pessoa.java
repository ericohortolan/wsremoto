package br.com.votacao.beans;

public class Pessoa  {
	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public void SetAll(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
