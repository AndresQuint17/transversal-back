package com.productcatalog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.dao.ISupplierDao;
import com.productcatalog.model.Supplier;
import com.productcatalog.service.ISupplierService;

@Service
public class SupplierServiceImpl implements ISupplierService {
	
	@Autowired
	private ISupplierDao dao;

	@Override
	public Supplier registrar(Supplier t) {
		return dao.save(t);
	}

	@Override
	public Supplier modificar(Supplier t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(String id) {
		
	}

	@Override
	public List<Supplier> listar() {
		return dao.findAll();
	}

	@Override
	public Supplier listarPorId(Integer id) {
		return dao.getOne(id);
	}

}
