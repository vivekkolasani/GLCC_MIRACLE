package com.miracle.orders.repository;

import java.util.Dictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miracle.orders.model.Line_Items;

@Repository
public interface LineRepository extends JpaRepository<Line_Items, Dictionary<String, String>> {

}
