package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.Category;
import com.productcatalog.service.ICategoryService;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired
	private ICategoryService service;
	
	@GetMapping
	public List<Category> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Category listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/save")
	public Category registrar(@RequestBody Category category){
		return service.registrar(category);
	}
}
