package com.productcatalog.service;

import org.springframework.web.multipart.MultipartFile;

import com.productcatalog.model.Product;

public interface IProductService extends ICRUD<Product>{
	public Product getJson(String productJson, MultipartFile file); 
}
