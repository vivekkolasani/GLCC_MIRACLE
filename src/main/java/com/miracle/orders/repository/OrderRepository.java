package com.miracle.orders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miracle.orders.model.GLCC_Orders;

@Repository
public interface OrderRepository extends JpaRepository<GLCC_Orders, String> {
	public List<GLCC_Orders> findByCustId(String custId);
}
