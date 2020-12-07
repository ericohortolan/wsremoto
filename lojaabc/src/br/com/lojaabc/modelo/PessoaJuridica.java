package br.com.lojaabc.modelo;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String contato;
	               
	public String getChamado() {
		return 
				"Nome....: " + super.getNome() + "\n" + 
				"Email...: " + super.getEmail() + "\n" + 
				"Contato.: " + contato;
	}
	
	public void setAll(int id, String nome, String email, boolean especial, String cnpj, String contato) {
		super.setAll(id, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + super.toString();
	}

	public PessoaJuridica(int id, String nome, String email, boolean especial, String cnpj, String contato) {
		super(id, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}

	public PessoaJuridica() {
		super();
	}
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	

}
