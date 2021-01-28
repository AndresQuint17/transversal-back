package com.productcatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productcatalog.model.Category;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Integer> {

}
