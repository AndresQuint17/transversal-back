package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.ProductColor;

@Repository
public interface IProductColorDao extends JpaRepository<ProductColor, Integer> {

}
