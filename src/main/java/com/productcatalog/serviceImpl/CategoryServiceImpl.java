package com.productcatalog.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productcatalog.dao.ICategoryDao;
import com.productcatalog.model.Category;
import com.productcatalog.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private ICategoryDao dao;

	@Override
	public Category registrar(Category t) {
		return dao.save(t);
	}

	@Override
	public Category modificar(Category t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {

	}

	@Override
	public List<Category> listar() {
		return dao.findAll();
	}

	@Override
	public Category listarPorId(Integer id) {
		return dao.getOne(id);
	}

	@Override
	public Category getJson(String categoryJson, MultipartFile file) {
		Category category = new Category();

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			category = objectMapper.readValue(categoryJson, Category.class);
			category.setPicture(file.getBytes());
		} catch (IOException err) {
			System.out.printf("Error", err.toString());
		}

		return category;
	}

}
