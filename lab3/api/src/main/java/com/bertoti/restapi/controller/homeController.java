package com.iacit.api.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.iacit.api.modal.viewTemperatura;
import com.iacit.api.repository.temperaturaRepository;

@Controller
@RestController
public class homeController {

@PostMapping(value = { "/print" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Precipitacao>> postFiltroPorData(@RequestBody FilterDataVo data) throws ParseException {

		List<Precipitacao> listPrecipitacao = precipitacaoService.getByFilter(data.getEstacao(), data.getDataInicio(), data.getDataFim());
		
		return listPrecipitacao != null && listPrecipitacao.size() > 0 ? new ResponseEntity<List<Precipitacao>>(listPrecipitacao, HttpStatus.CREATED)
				: new ResponseEntity<List<Precipitacao>>(listPrecipitacao, HttpStatus.BAD_REQUEST);

	}
}
