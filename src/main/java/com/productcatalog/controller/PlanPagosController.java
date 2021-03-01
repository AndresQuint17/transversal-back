package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.dataTransferObject.EquipoFinanciadoDto;
import com.productcatalog.dataTransferObject.PlanPagosDto;
import com.productcatalog.service.IPlanPagosService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/PlanPagos")
public class PlanPagosController {

	@Autowired
	private IPlanPagosService service;
	
	@PostMapping(value = "/Calcular", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<PlanPagosDto> registrar(@RequestBody EquipoFinanciadoDto equipoFinanciado){
		
		return service.calcularPlanPagos(equipoFinanciado);
	}
}
