package com.productcatalog.service;

import java.util.List;

public interface ICRUD<T> {
	T registrar(T t);
	T modificar(T t);
	void eliminar(String id);
	List<T> listar();
	T listarPorId(Integer id);
}
