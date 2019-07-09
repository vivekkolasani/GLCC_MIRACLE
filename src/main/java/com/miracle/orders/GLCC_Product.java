package com.miracle.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GLCC_Product {
	@Id
	String productId;
	@Column
	String productName;
	@Column 
	float price;
	@Column
	String category;
	public GLCC_Product(String productId, String productName, float price, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	public GLCC_Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
