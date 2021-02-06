package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.AvailableProductColor;
import com.productcatalog.service.IAvailableProductColorService;

@RestController
@RequestMapping("/AvailableProductColor")
public class AvailableProductColorController {

	@Autowired
	private IAvailableProductColorService service;
	
	@GetMapping
	public List<AvailableProductColor> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public AvailableProductColor listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/Save")
	public AvailableProductColor registrar(@RequestBody AvailableProductColor availableProductColor){
		return service.registrar(availableProductColor);
	}
}
