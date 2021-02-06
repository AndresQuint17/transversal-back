package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.AvailableProductSize;

@Repository
public interface IAvailableProductSizeDao extends JpaRepository<AvailableProductSize, Integer> {

}
