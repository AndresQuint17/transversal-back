package com.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="available_product_color")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AvailableProductColor {

	@Id
	@Column(name="availableproductcolorid", nullable=false)
	private int availableProductColorId;
	@ManyToOne
	@JoinColumn(name="productid", nullable=false, foreignKey = @ForeignKey(name="productcolorid"))
	private Product product;
	@ManyToOne
	@JoinColumn(name="productcolorid", nullable=false, foreignKey = @ForeignKey(name="productcolorid"))
	private ProductColor productColor;
	
	public int getAvailableProductColorId() {
		return availableProductColorId;
	}
	public void setAvailableProductColorId(int availableProductColorId) {
		this.availableProductColorId = availableProductColorId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductColor getProductColor() {
		return productColor;
	}
	public void setProductColor(ProductColor productColor) {
		this.productColor = productColor;
	}
	
}
