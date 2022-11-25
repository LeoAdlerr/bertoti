package com.bertoti.bertotiApiRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping (value = {"/"})
public class TemplateController {
	// Método para inicialização de página
		@GetMapping(value = { "index" })
		public ModelAndView Index() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("index");

			return modelAndView;
		}

}
