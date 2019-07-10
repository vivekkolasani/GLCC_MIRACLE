package com.miracle.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miracle.orders.model.GLCC_Product;

public interface ProductRepository extends JpaRepository<GLCC_Product, String> {

}
