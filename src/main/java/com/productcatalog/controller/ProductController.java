package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.Product;
import com.productcatalog.service.IProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private IProductService service;

	@GetMapping
	public List<Product> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Product listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/Save")
	public Product registrar(@RequestBody Product product){
		return service.registrar(product);
	}
}
