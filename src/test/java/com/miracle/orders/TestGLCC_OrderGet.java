package com.miracle.orders;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.miracle.orders.model.GLCC_Orders;
import com.miracle.orders.repository.OrderRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestGLCC_OrderGet {

	@Autowired(required=true)
	private OrderRepository orderRepository;
	
	private GLCC_Orders order;
	
	@Test
	public void testGetOrderNumber()
	{
		String orderNumber ="";
		List<GLCC_Orders> order1 = new ArrayList<GLCC_Orders>();
		order1 = orderRepository.findByCustId("124");
		for(GLCC_Orders ord : order1)
		{
			orderNumber = ord.getOrderNumber();
		}
		 assertEquals(orderNumber,"PO345");
	}
	
	@Test
	public void testGetOrderNumberNotNull()
	{
		String orderNumber ="";
		List<GLCC_Orders> order = new ArrayList<GLCC_Orders>();
		order = orderRepository.findByCustId("124");
		for(GLCC_Orders ord : order)
		{
			orderNumber = ord.getOrderNumber();
		}
		 assertNotNull(orderNumber);
	}
	
	@Test
	public void testOrderStatus()
	{
		List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
		orders = orderRepository.findAll();
		String status = "";
		for(GLCC_Orders orderList : orders)
		{
			status = orderList.getStatus();
			if(status.equals("CAN"))
			{
				break;
			}
		}
		assertEquals("CAN",status);
		
	}
	
	@Test
	public void testOrderStatusNotNull()
	{
		String status ="";
		List<GLCC_Orders> order = new ArrayList<GLCC_Orders>();
		order = orderRepository.findByCustId("124");
		for(GLCC_Orders ord : order)
		{
			status = ord.getStatus();
		}
		 assertNotNull(status);
	}
	
	@Test
	public void testOrderDate()
	{
		//String orderDate ="";
		GLCC_Orders order;
		order = orderRepository.findById("12345").get();
		assertEquals("10JUN2019", order.getOrderdate());
	}
	
	@Test
	public void testOrderDateNotNull()
	{
		GLCC_Orders order;
		order = orderRepository.findById("12345").get();
		assertNotNull(order.getOrderdate());
	}
	@Test
	public void testShipDate()
	{
		GLCC_Orders order;
		order = orderRepository.findById("PO345").get();
		assertEquals("12Jul19", order.getShippeddate());
	}
	@Test
	public void testShipDateNotNull()
	{
		GLCC_Orders order;
		order = orderRepository.findById("PO435").get();
		assertNotNull(order.getShippeddate());
	}
	
	@Test
	public void testRequiredDate()
	{
		GLCC_Orders order;
		order = orderRepository.findById("1234").get();
		assertEquals("14JUN2019", order.getRequireddate());
	}
	
	@Test
	public void testOrderDateValid()
	{
		GLCC_Orders order;
		order = orderRepository.findById("12345").get();
		assertEquals("",order.getRequireddate());
	}
	@Test
	public void testShipDateValid()
	{
		GLCC_Orders order;
		order = orderRepository.findById("1234").get();
		assertEquals("", order.getRequireddate());
	}
	
	@Test
	public void testRequiredDateValid()
	{
		GLCC_Orders order;
		order = orderRepository.findById("12345").get();
		assertEquals("",order.getRequireddate());
	}
	
	
}
