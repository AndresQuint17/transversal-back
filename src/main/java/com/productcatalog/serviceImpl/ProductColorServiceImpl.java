package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.IProductColorDao;
import com.productcatalog.model.ProductColor;
import com.productcatalog.service.IProductColorService;

@Service
public class ProductColorServiceImpl implements IProductColorService {

	@Autowired
	private IProductColorDao dao;
	
	@Override
	public ProductColor registrar(ProductColor t) {
		return dao.save(t);
	}

	@Override
	public ProductColor modificar(ProductColor t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<ProductColor> listar() {
		return dao.findAll();
	}

	@Override
	public ProductColor listarPorId(Integer id) {
		return dao.getOne(id);
	}

}
