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
@Table(name="available_product_size")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AvailableProductSize {

	@Id
	@Column(name="availableproductsizeid", nullable=false)
	private int availableProductSizeId;
	@ManyToOne
	@JoinColumn(name="productid", nullable=false, foreignKey = @ForeignKey(name="productcolorid"))
	private Product product;
	@ManyToOne
	@JoinColumn(name="productsizeid", nullable=false, foreignKey = @ForeignKey(name="productsizeid"))
	private ProductSize productSize;
}
