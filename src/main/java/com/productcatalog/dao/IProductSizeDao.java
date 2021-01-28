package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.ProductSize;

@Repository
public interface IProductSizeDao extends JpaRepository<ProductSize, Integer> {

}
