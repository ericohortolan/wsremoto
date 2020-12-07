package br.com.lojaabc.modelo;

public class Fabricante {
	private String cnpj;
	private String razaoSocial;
	private String fone;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Fabricante(String cnpj, String razaoSocial, String fone) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.fone = fone;
	}
	public Fabricante() {
		super();
	}
	@Override
	public String toString() {
		return "Fabricante [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", fone=" + fone + "]";
	}
	public void setAll(String cnpj, String razaoSocial, String fone) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.fone = fone;
	}
	
	
}
