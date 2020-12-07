package br.com.universidadexyz.beans;

public class Turma {
	private int numero;
	private Aluno aluno;
	private Professor professor;
	private Curso curso;
	private String periodo;
	private String sala;
	public Turma() {
		super();
	}
	public Turma(int numero, Aluno aluno, Professor professor, Curso curso, String periodo, String sala) {
		super();
		this.numero = numero;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
		this.periodo = periodo;
		this.sala = sala;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String toString() {
		return "Turma [numero=" + numero + ", aluno=" + aluno + ", professor=" + professor + ", curso=" + curso
				+ ", periodo=" + periodo + ", sala=" + sala + "]";
	}
	public void setAll(int numero, Aluno aluno, Professor professor, Curso curso, String periodo, String sala) {
		this.numero = numero;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
		this.periodo = periodo;
		this.sala = sala;
	}

































}
