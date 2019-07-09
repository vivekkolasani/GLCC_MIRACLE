package com.miracle.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	@Autowired
	private OrderRepository orderRepository; 
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/orders/newOrder")
	@Transactional
	@Modifying(clearAutomatically = true)
	public GLCC_Orders addNewOrder(@RequestBody GLCC_Orders o1) {
		return orderRepository.save(o1);
	}
	
	@PutMapping("/orders/updateOrder/{orderId}")
	@Transactional
	@Modifying(clearAutomatically = true)
	public GLCC_Orders updateOrder(@PathVariable(value = "orderId") String id, @RequestBody GLCC_Orders o1) {
		return orderRepository.save(o1);
	}
	
	@GetMapping("/orders/{custId}")
	public List<GLCC_Orders> displayAll(@PathVariable(value = "custId") String customerId){
		return orderRepository.findByCustId(customerId);
	}
	
	@GetMapping("/products")
	public List<GLCC_Product> displayProcucts(){
		return productRepository.findAll();
	}
}
