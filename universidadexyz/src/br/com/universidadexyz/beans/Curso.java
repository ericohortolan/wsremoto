package br.com.universidadexyz.beans;

public class Curso {
	private String descricao;
	private float valor;
	private short cargaHoraria;
	private String sigla;
	private int id;
	private int duracao;
	
	public Curso(String descricao, float valor, short cargaHoraria) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public Curso(String descricao, int id) {
		super();
		this.descricao = descricao;
		this.id = id;
	}

	public Curso() {
		
	}

	public Curso(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}

	public void ajustarValor(float porcentagem) {
		valor = valor + valor * (porcentagem/100);
	}
	
	public float getPromocao(float porcentagem) {
		return valor - valor * (porcentagem/100);
	}
	
	public float getPromocao() {
		return valor * (float) 0.9;
	}
	
	/*
	 * - Crie um getPromocao() => vai retornar o valor do curso com 10% de desconto
	 * - Crie um getPromocao(float porcentagem) => vai retornar o valor do curso
	 * de acordo com a porcentagem que foi recebida
	 * - Crie um método ajustarValor(float porcentagem) => vai alterar o valor 
	 * do curso de acordo com a porcentagem recebida.
	 * 
	 */
	
	public void setAll(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		this.descricao=descricao;
		this.valor=valor;
		this.cargaHoraria= cargaHoraria;
		this.sigla= sigla;
		this.id = id;
		this.duracao=duracao;
	}
	
	public String getAll() {
		return 
				"Descrição.....: " + descricao + "\n" +
				"Valor.........: " + valor + "\n" + 
				"Carga Horária.: " + cargaHoraria + "\n" + 
				"Sigla.........: " + sigla + "\n" + 
				"Código........: " + id + "\n" + 
				"Duração.......: " + duracao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public short getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
