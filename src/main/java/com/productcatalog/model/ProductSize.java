package com.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product_size")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductSize {
	
	@Id
	@Column(name = "productsizeid", nullable = false)
	private int productSizeId;
	@Column(name = "size")
	private String size;
	
	public int getProductSizeId() {
		return productSizeId;
	}
	public void setProductSizeId(int productSizeId) {
		this.productSizeId = productSizeId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
