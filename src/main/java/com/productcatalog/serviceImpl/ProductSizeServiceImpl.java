package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.IProductSizeDao;
import com.productcatalog.model.ProductSize;
import com.productcatalog.service.IProductSizeService;

@Service
public class ProductSizeServiceImpl implements IProductSizeService {

	@Autowired
	private IProductSizeDao dao;

	@Override
	public ProductSize registrar(ProductSize t) {
		return dao.save(t);
	}

	@Override
	public ProductSize modificar(ProductSize t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<ProductSize> listar() {
		return dao.findAll();
	}

	@Override
	public ProductSize listarPorId(Integer id) {
		return dao.getOne(id);
	}
	
	
}
