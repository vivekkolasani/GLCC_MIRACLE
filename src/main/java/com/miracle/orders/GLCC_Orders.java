package com.miracle.orders;

import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GLCC_Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String orderNumber;
//	@Column
//	List<GLCC_Product> lineItems;
	@Column
	Date orderdate;
	@Column
	Date requireddate;
	@Column
	Date shippeddate;
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
	@Column
	String type;
	
	public GLCC_Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GLCC_Orders(String orderNumber, Date orderdate, Date requireddate, Date shippeddate, String custId,
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
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public Date getRequireddate() {
		return requireddate;
	}
	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}
	public Date getShippeddate() {
		return shippeddate;
	}
	public void setShippeddate(Date shippeddate) {
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
