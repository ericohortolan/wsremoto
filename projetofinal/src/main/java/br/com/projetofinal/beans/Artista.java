package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_artista")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nomeartistico", length=100)
	private String nomeartistico;
	
	@Column(name="nacionalidade", length=100)
	private String nacionalidade;

	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("artista")
	private List<Musica> musicas;
	
	public List<Musica> getMusicas(){
		return musicas;
	}
	
	public void setMusicas(List<Musica> musicas){
		this.musicas = musicas;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeartistico() {
		return nomeartistico;
	}

	public void setNomeartistico(String nomeartistico) {
		this.nomeartistico = nomeartistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Artista(int id, String nomeartistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeartistico = nomeartistico;
		this.nacionalidade = nacionalidade;
	}

	public Artista() {
		super();
	}
	
	
	
}
