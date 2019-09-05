package com.hoony.msa.springboot.repository.dvo;

import lombok.Data;

@Data
public class OrderStatusDVO {
	private String id;
	private String orderHistory; //주문내역

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(String orderHistory) {
		this.orderHistory = orderHistory;
	}
}
