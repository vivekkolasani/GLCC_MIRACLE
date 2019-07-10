package com.miracle.orders.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GLCC_Orders {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	String orderNumber;
	@Column
	String orderdate;
	@Column
	String requireddate;
	@Column
	String shippeddate;
	@Column
	String custId;
	@Column
	float tax;
	@Column 
	float discountPrice;
	@Column
	float orderTotalPrice;
	@Column
	float paymentAmount;
	@Column
	String Status;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column
	String type;
	
	public GLCC_Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GLCC_Orders(String orderNumber, String orderdate, String requireddate, String shippeddate, String custId,
			float tax, float discountPrice, float orderTotalPrice, float paymentAmount) {
		super();
		this.orderNumber = orderNumber;
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.shippeddate = shippeddate;
		this.custId = custId;
		this.tax = tax;
		this.discountPrice = discountPrice;
		this.orderTotalPrice = orderTotalPrice;
		this.paymentAmount = paymentAmount;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getRequireddate() {
		return requireddate;
	}
	public void setRequireddate(String requireddate) {
		this.requireddate = requireddate;
	}
	public String getShippeddate() {
		return shippeddate;
	}
	public void setShippeddate(String shippeddate) {
		this.shippeddate = shippeddate;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}
	public float getOrderTotalPrice() {
		return orderTotalPrice;
	}
	public void setOrderTotalPrice(float orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
}
