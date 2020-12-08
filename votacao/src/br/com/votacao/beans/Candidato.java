package br.com.votacao.beans;

public class Candidato extends Pessoa {
	public int numero;
	public String cargo;
	public String partido;
		
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public Candidato(int numero, String cargo, String partido) {
		super();
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}
	public void SetAll(int numero, String cargo, String partido) {
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}
	public Candidato() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", cargo=" + cargo + ", partido=" + partido + "]";
	}
	
	
	
	
}
