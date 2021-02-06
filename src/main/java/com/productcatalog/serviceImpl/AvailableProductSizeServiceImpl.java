package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.IAvailableProductSizeDao;
import com.productcatalog.model.AvailableProductSize;
import com.productcatalog.service.IAvailableProductSizeService;

@Service
public class AvailableProductSizeServiceImpl implements IAvailableProductSizeService {


	@Autowired
	private IAvailableProductSizeDao dao;
	
	@Override
	public AvailableProductSize registrar(AvailableProductSize t) {
		return dao.save(t);
	}

	@Override
	public AvailableProductSize modificar(AvailableProductSize t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<AvailableProductSize> listar() {
		return dao.findAll();
	}

	@Override
	public AvailableProductSize listarPorId(Integer id) {
		return dao.getOne(id);
	}

}
