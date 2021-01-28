package com.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product_color")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductColor {
	
	@Id
	@Column(name = "productcolorid", nullable = false)
	private int productColorId;
	@Column(name = "color")
	private String color;
	
	public int getProductColorId() {
		return productColorId;
	}
	public void setProductColorId(int productColorId) {
		this.productColorId = productColorId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
