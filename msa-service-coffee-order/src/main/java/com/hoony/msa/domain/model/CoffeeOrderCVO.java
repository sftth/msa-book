package com.hoony.msa.domain.model;


import lombok.Data;

@Data
public class CoffeeOrderCVO {
	private String id;
	private String orderNumber; //주문번호 
	private String coffeeName;  //커피종류 
	private String coffeeCount; //커피개수 
	private String customerName;//회원명 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public String getCoffeeCount() {
		return coffeeCount;
	}

	public void setCoffeeCount(String coffeeCount) {
		this.coffeeCount = coffeeCount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
