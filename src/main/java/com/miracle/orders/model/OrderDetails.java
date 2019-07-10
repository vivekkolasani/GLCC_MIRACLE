package com.miracle.orders.model;

public class OrderDetails 
{
	
	String orderNum;
	String ordereddate;
	String requireddate;
	String shippeddate;
	String custId;
	float tax;
	float discount;
	float orderPrice;
	float paymentAmount;
	String Status;
	String type;
	private Line_Items[] productDetails;
//	private float coupon;
	
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
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
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
	
	public String getOrdereddate() {
		return ordereddate;
	}
	public void setOrdereddate(String ordereddate) {
		this.ordereddate = ordereddate;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
//	public float getCoupon() {
//		return coupon;
//	}
//	public void setCoupon(float coupon) {
//		this.coupon = coupon;
//	}
	
		
	public float calDiscount(float discount, float price)
	{
		 float calculatedDiscount = 0;
		
		calculatedDiscount = (float) (price - (price * discount * 0.01));
		
		return calculatedDiscount;
		
	}
	public Line_Items[] getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(Line_Items[] productDetails) {
		this.productDetails = productDetails;
	}
}
