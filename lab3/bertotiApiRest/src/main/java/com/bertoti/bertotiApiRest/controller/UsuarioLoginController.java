package com.bertoti.bertotiApiRest.controller;
/*
import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bertoti.bertotiApiRest.entity.Usuario;
import com.bertoti.bertotiApiRest.service.ServiceUsuario;

@Controller
public class UsuarioLoginController {

	@Autowired
	private ServiceUsuario serviceUsuario;

	@PostMapping(value = { "/login" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> read(@RequestBody DadosUsuario usuario) {
		serviceUsuario.returnUsuario(usuario.getEmail(), usuario.getSenha());

		Usuario usuarioRead = serviceUsuario.returnUsuario(usuario.getEmail(), usuario.getSenha());

		return usuarioRead != null ? new ResponseEntity<Void>(HttpStatus.ACCEPTED)
				: new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
}
*/