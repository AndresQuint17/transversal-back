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

import com.productcatalog.model.Category;
import com.productcatalog.service.ICategoryService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired
	private ICategoryService service;

	@GetMapping
	public List<Category> listar() {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Category listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}

	@PostMapping(value = "/Save", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE })
	public Category registrar(@RequestParam("category") String categoryJson, @RequestParam("file") MultipartFile file) {

		Category category = service.getJson(categoryJson, file);
		return service.registrar(category);
		//return category;
	}
}
