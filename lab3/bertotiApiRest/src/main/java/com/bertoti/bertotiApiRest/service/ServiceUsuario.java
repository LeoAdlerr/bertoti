package com.bertoti.bertotiApiRest.service;

import java.util.List;

import com.bertoti.bertotiApiRest.entity.Usuario;
import com.bertoti.bertotiApiRest.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {
	@Autowired(required = true)
	private UsuarioRepository usuarioRepository;

	//Retun de usuario
	public Usuario returnUsuario(String email, String senha) {
		Usuario user = usuarioRepository.findByest_Nome_Senha_Usuario(email, senha);
		
		return user;
	}

	//Salvar o usuario ou seja cadastrar
	public Usuario save(String nome, String email, String senha) {
		Usuario usuario = new Usuario(nome, email, senha);
		Usuario saveUsuario = new Usuario();
		if (usuario.getUsuEmail().isEmpty() || usuario.getUsuNome().isEmpty()
				|| usuario.getUsuSenha().isEmpty()) {
		}else {
			saveUsuario = usuarioRepository.save(usuario);
		}
		
		return saveUsuario;
	}
	
	public List<Usuario> listUsuario() {
		List<Usuario> user = usuarioRepository.selectListaUsuario();
		return user;
	}
	
}
