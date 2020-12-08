package br.com.votacao.beans;

public class Voto {
	public Pessoa eleitor;
	public Pessoa candidato;
	public boolean primeiroTurno;
	
	public Pessoa getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Pessoa getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public boolean isPrimeiroTurno() {
		return primeiroTurno;
	}
	public void setPrimeiroTurno(boolean primeiroTurno) {
		this.primeiroTurno = primeiroTurno;
	}
	public Voto(Pessoa eleitor, Pessoa candidato, boolean primeiroTurno) {
		super();
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeiroTurno = primeiroTurno;
	}
	
	public void SetAll(Pessoa eleitor, Pessoa candidato, boolean primeiroTurno) {
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeiroTurno = primeiroTurno;
	}
	public Voto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Voto [eleitor=" + eleitor + ", candidato=" + candidato + ", primeiroTurno=" + primeiroTurno + "]";
	}
	
}
