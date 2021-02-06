package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.IAvailableProductColorDao;
import com.productcatalog.model.AvailableProductColor;
import com.productcatalog.service.IAvailableProductColorService;

@Service
public class AvailableProductColorServiceImpl implements IAvailableProductColorService {

	@Autowired
	private IAvailableProductColorDao dao;

	@Override
	public AvailableProductColor registrar(AvailableProductColor t) {
		return dao.save(t);
	}

	@Override
	public AvailableProductColor modificar(AvailableProductColor t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<AvailableProductColor> listar() {
		return dao.findAll();
	}

	@Override
	public AvailableProductColor listarPorId(Integer id) {
		return dao.getOne(id);
	}
	
}
