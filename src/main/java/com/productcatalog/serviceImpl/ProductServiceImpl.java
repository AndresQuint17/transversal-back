package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.IProductDao;
import com.productcatalog.model.Product;
import com.productcatalog.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao dao;

	@Override
	public Product registrar(Product t) {
		return dao.save(t);
	}

	@Override
	public Product modificar(Product t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<Product> listar() {
		return dao.findAll();
	}

	@Override
	public Product listarPorId(Integer id) {
		return dao.getOne(id);
	}

}
