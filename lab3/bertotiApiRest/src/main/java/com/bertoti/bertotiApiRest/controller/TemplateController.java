package com.bertoti.bertotiApiRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping(value = { "/" })
public class TemplateController {

	// Método para inicialização de página
	@GetMapping(value = { "home" })
	public ModelAndView Index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.html");

		return modelAndView;
	}

	@GetMapping(value = { "cadastro" })
	public ModelAndView Cadastro() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cadastro.html");

		return modelAndView;
	}
	
	@GetMapping(value = { "cadastro2" })
	public ModelAndView Cadastro2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cadastro2.html");

		return modelAndView;
	}

	@GetMapping(value = { "login" })
	public ModelAndView Login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");

		return modelAndView;
	}

}

