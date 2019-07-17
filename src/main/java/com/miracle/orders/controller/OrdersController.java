package com.miracle.orders.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.orders.model.GLCC_Orders;
import com.miracle.orders.model.GLCC_Product;
import com.miracle.orders.model.Line_Items;
import com.miracle.orders.model.OrderDetails;
import com.miracle.orders.repository.LineRepository;
import com.miracle.orders.repository.OrderRepository;
import com.miracle.orders.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrdersController {
	@Autowired
	private OrderRepository orderRepository; 
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private LineRepository lineRepository;
	
	@PostMapping("/orders/newOrder")
	@Transactional
	@Modifying(clearAutomatically = true)
	public OrderDetails addNewOrder(@RequestBody OrderDetails o1) {
		System.out.println(o1.toString());
		GLCC_Orders order = new GLCC_Orders();
		order.setOrderNumber(o1.getOrderNum());
		order.setCustId(o1.getCustId());
		order.setDiscountPrice(o1.getDiscount());
		order.setOrderdate(o1.getOrdereddate());
		order.setOrderTotalPrice(o1.getOrderPrice());
		order.setPaymentAmount(0);
		order.setTax(o1.getTax());
		order.setRequireddate(o1.getRequireddate());
		order.setShippeddate(o1.getShippeddate());
		order.setStatus("PLA");
		order.setType("SO");
//		orderRepository.save(order);
		orderRepository.save(order);
		addLineItems(o1.getProductDetails(), o1.getOrderNum());
		return o1;
	}
	
	@PostMapping
	public void addLineItems(Line_Items[] l, String orderNumber) {
		for(Line_Items l1 : l) {
			l1.setOrderNumber(orderNumber);
			lineRepository.save(l1);
		}
	}
//	@PutMapping("/orders/updateOrder/{orderId}")
//	@Transactional
//	@Modifying(clearAutomatically = true)
//	public void updateOrder(@PathVariable(value = "orderId") String id, @RequestBody OrderDetails o1) {
//		GLCC_Orders order = new GLCC_Orders();
//		order.setCustId(o1.getCustId());
//		order.setDiscountPrice(o1.getDiscount());
//		order.setOrderdate(o1.getOrdereddate());
//		order.setOrderTotalPrice(o1.getOrderPrice());
//		order.setPaymentAmount(0);
//		order.setTax(o1.getTax());
//		orderRepository.save(order);
//		
//		for(Line_Items l1 : o1.getProductDetails()) {
//			lineRepository.save(l1);
//		}
//		
////		return orderRepository.save(o1);
//	}
	
//	@PutMapping("/orders/deleteOrder/{orderId}")
//	public void deleteById(@PathVariable(value = "orderId") String id, @RequestBody OrderDetails o1) {
//		
//	}
//	
//	@DeleteMapping()
	
	@GetMapping("/orders/{custId}")
	public List<GLCC_Orders> displayAll(@PathVariable(value = "custId") String customerId){
		return orderRepository.findByCustId(customerId);
	}
	
	@GetMapping("/orders")
	public List<GLCC_Orders> displayAllOrders(){
		List<GLCC_Orders> orders = orderRepository.findAll();
		List<GLCC_Orders> result = new ArrayList<GLCC_Orders>();
		for(GLCC_Orders o : orders) {
			if(!"CAN".equalsIgnoreCase(o.getStatus()))
				result.add(o);
		}
		return result;
	}
	
	@GetMapping("/orders/{orderId}")
	public GLCC_Orders displayOrderById(@PathVariable(value = "orderId") String orderId) {
		return orderRepository.findByOrderNumber(orderId);
	}
	
	@GetMapping("/products")
	public List<GLCC_Product> displayProcucts(){
		return productRepository.findAll();
	}
}
