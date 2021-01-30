package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productcatalog.model.Product;

public interface IProductDao extends JpaRepository<Product, Integer>{

}
