package br.com.votacao.beans;

public class Eleitor extends Pessoa {
	public int titulo;
	public boolean ativo;
	
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Eleitor(int titulo, boolean ativo) {
		super();
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	public void SetAll(int titulo, boolean ativo) {
		this.titulo = titulo;
		this.ativo = ativo;
	}
	public Eleitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Eleitor [titulo=" + titulo + ", ativo=" + ativo + "]";
	}
	
	
	
}
