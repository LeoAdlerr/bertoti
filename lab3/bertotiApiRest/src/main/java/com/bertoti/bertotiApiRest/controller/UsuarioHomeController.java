package com.bertoti.bertotiApiRest.controller;

import java.util.List;

import com.bertoti.bertotiApiRest.entity.Usuario;
import com.bertoti.bertotiApiRest.service.ServiceUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/homeUsuario"})
public class UsuarioHomeController {

	@Autowired ServiceUsuario usuarioService;
	
	public ResponseEntity<List<Usuario>> listaRegiao() {
		List<Usuario> listRegiao = usuarioService.listUsuario();
		return listRegiao != null && listRegiao.size() > 0 ? new ResponseEntity<List<Usuario>>(
			listRegiao, HttpStatus.ACCEPTED
		)
		: new ResponseEntity<List<Usuario>>(listRegiao, HttpStatus.BAD_REQUEST);
	}

}
