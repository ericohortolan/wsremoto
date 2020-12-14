package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public List<Artista> getAll() {
		List<Artista> lista = (List<Artista>) dao.findAll();
		return lista;
	}
	
	@GetMapping("/artista/{cod}")
	public Artista getUser(@PathVariable int cod) {
		Artista artista = dao.findById(cod).orElse(null);
		return artista;
	}
	
	@GetMapping("/delArtista/{cod}")
	public String apagarArtista(@PathVariable int cod) {
		if (getUser(cod) == null) {
			return "Nao Existe";
		} else {
		dao.deleteById(cod);
		return "OK";
		}
	}
	
	@GetMapping("/addArtista/nacionalidade={nacionalidade}&nomeartistico={nomeartistico}")
	public String adicionarArtista(@PathVariable String nacionalidade,@PathVariable String nomeartistico) {
		
		dao.save(new Artista(0,nomeartistico,nacionalidade));
		return "OK";
	}
	
}
