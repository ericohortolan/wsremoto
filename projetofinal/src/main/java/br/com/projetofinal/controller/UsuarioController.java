package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@CrossOrigin("*")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		return lista;
	}
	
	@GetMapping("/usuario/{cod}")
	public Usuario getUser(@PathVariable int cod){
		Usuario user = dao.findById(cod).orElse(null);
		return user;
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario objeto){
		try {
			Usuario resposta = dao.save(objeto);
			return ResponseEntity.ok(resposta);
		} catch (Exception e) {
			return ResponseEntity.status(404).build();
		}
	}
}
