package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.Supplier;

@Repository
public interface ISupplierDao extends JpaRepository<Supplier, Integer> {

}
