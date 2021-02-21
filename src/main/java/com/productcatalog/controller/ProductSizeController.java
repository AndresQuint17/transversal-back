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

import com.productcatalog.model.ProductSize;
import com.productcatalog.service.IProductSizeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ProductSize")
public class ProductSizeController {

	@Autowired
	private IProductSizeService service;
	
	@GetMapping
	public List<ProductSize> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ProductSize listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/Save")
	public ProductSize registrar(@RequestBody ProductSize productSize){
		return service.registrar(productSize);
	}
}
