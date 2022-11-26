package com.bertoti.bertotiApiRest.controller;
import com.bertoti.bertotiApiRest.entity.Usuario;
import com.bertoti.bertotiApiRest.service.ServiceUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UsuarioLoginController {
	@Autowired
	private ServiceUsuario serviceUsuario;

	// CREATE
	@PostMapping(value = { "/UsuarioLogin" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> login(@RequestBody DadosUsuario usuario) {
		Usuario usu = serviceUsuario.returnUsuario(usuario.getEmail(), usuario.getSenha());
		return usu != null ? new ResponseEntity<Usuario>(usu, HttpStatus.CREATED)
				: new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
	}
}
