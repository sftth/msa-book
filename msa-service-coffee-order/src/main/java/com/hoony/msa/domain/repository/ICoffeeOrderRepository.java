package com.hoony.msa.domain.repository;

import com.hoony.msa.domain.model.OrderEntity;

public interface ICoffeeOrderRepository {
	//커피 주문 데이터 CRUD처리관련 인터페이스
	public String coffeeOrderSave(OrderEntity orderEntity);

}
