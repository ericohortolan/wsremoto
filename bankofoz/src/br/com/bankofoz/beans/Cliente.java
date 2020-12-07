package br.com.bankofoz.beans;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private boolean especial;
	
	public String getChamado() {
		return null;
	}
	
	
	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getPrimeiroNome() {
		if (nome.contains(" ")==true) {
			return nome.substring(0, nome.indexOf(" "));
		}
		return nome;
	}
	
	public String getUsuario() {
		if (email.contains("@")==true) {
			return email.substring(0, email.indexOf("@"));
		}
		return email;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public Cliente(int id, String nome, String email, boolean especial) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", especial=" + especial + "]";
	}
	public void setAll(int id, String nome, String email, boolean especial) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}

}
