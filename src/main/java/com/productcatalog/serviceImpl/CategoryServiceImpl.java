package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
