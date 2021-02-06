package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.AvailableProductColor;

@Repository
public interface IAvailableProductColorDao extends JpaRepository<AvailableProductColor, Integer> {

}
