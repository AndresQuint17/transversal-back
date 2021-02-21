package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.productcatalog.model.Product;
import com.productcatalog.service.IProductService;

@CrossOrigin(origins = "http://localhost:4200")
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
	
	@PostMapping(value = "/Save", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE })
	public Product registrar(@RequestParam("product") String productJson, @RequestParam("file") MultipartFile file){
		Product product = service.getJson(productJson, file);
		return service.registrar(product);
	}
}
