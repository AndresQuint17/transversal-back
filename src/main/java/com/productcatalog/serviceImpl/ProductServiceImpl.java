package com.productcatalog.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
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

	@Override
	public Product getJson(String productJson, MultipartFile file) {
		Product product = new Product();

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			product = objectMapper.readValue(productJson, Product.class);
			product.setPicture(file.getBytes());
		} catch (IOException err) {
			System.out.printf("Error", err.toString());
		}

		return product;
	}

}
