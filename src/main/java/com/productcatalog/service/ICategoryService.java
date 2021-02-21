package com.productcatalog.service;

import org.springframework.web.multipart.MultipartFile;

import com.productcatalog.model.Category;

public interface ICategoryService extends ICRUD<Category> {
	public Category getJson(String categoryJson, MultipartFile file); 
}
