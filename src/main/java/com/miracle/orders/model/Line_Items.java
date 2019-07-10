package com.miracle.orders.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(LineItemsId.class)
public class Line_Items implements Serializable{
	@Id
	private String productId;
	@Id
	private String orderNumber;
	@Column
	int quantity;
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Line_Items(String productId, String orderNumber, int quantity) {
		super();
		this.productId = productId;
		this.orderNumber = orderNumber;
		this.quantity = quantity;
	}

	public Line_Items() {
		// TODO Auto-generated constructor stub
	}

}
