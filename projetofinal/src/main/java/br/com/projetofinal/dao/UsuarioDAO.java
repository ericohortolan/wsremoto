package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	Usuario findByEmailAndSenha(String email, String senha);
}