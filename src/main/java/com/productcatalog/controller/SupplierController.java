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

import com.productcatalog.model.Supplier;
import com.productcatalog.service.ISupplierService;

@CrossOrigin(origins = "http://localhost:4200/%22")
@RestController
@RequestMapping("/Supplier")
public class SupplierController {

	@Autowired
	private ISupplierService service;
	
	@GetMapping
	public List<Supplier> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Supplier listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping("/Save")
	public Supplier registrar(@RequestBody Supplier supplier){
		return service.registrar(supplier);
	}
}
