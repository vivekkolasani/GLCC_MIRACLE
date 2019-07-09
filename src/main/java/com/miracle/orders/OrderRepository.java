package com.miracle.orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<GLCC_Orders, String> {
	public List<GLCC_Orders> findByCustId(String custId);
}
