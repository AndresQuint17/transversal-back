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
@Table(name="product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {

	@Id
	@Column(name = "productid", nullable = false)
	private int productId;
	@ManyToOne
	@JoinColumn(name = "supplierid", nullable = false, foreignKey = @ForeignKey(name = "supplierid"))
	private Supplier supplier;
	@ManyToOne
	@JoinColumn(name = "categoryid", nullable = false, foreignKey = @ForeignKey(name = "categoryid"))
	private Category category;
	@Column(name = "sku")
	private String sku;
	@Column(name = "productname")
	private String productName;
	@Column(name = "productdescription")
	private String productDescription;
	@Column(name = "quantityperunit")
	private int quantityPerUnit;
	@Column(name = "unitprice")
	private double unitPrice;
	@Column(name = "discount")
	private double discount;
	@Column(name = "unitweight")
	private double unitWeight;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}
}
