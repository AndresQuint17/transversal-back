package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.ProductColor;
import com.productcatalog.service.IProductColorService;

@CrossOrigin(origins = "http://localhost:4200/%22")
@RestController
@RequestMapping("/ProductColor")
public class ProductColorController {
	
	@Autowired
	IProductColorService service;
	
	@GetMapping
	public List<ProductColor> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ProductColor listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/Save")
	public ProductColor registrar(@RequestBody ProductColor productColor){
		return service.registrar(productColor);
	}
}
