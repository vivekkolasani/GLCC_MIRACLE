package com.miracle.orders;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.miracle.orders.model.GLCC_Orders;
import com.miracle.orders.repository.OrderRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestGLCC_Order {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	
		@Autowired
		private OrderRepository orderRepository;
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
//		@Test
//		public void testAddNewOrder1() throws Exception {
//			Date orderDate, requireDate, shipDate;
////			orderDate = dateFormat.parse("07-Jul-19");
////			requireDate = dateFormat.parse("07-15-2019");
////			shipDate = dateFormat.parse("07-06-2019");
//		//	GLCC_Orders order = new GLCC_Orders("123",orderDate, requireDate,shipDate, "1", 2.9f, 0f, 300.82f, 1200.12f );
//		//	orderRepository.save(order);
//			List<?> queryResult = orderRepository.findByCustId("1");
//			//Mockito.when(orderRepository..thenReturn(order));
//			//asserThat(service.getById.isEqualTo(order));
//			assertFalse(queryResult.isEmpty());
//	        assertNotNull(queryResult.get(0));
//	      
//		}
		
		@Test
		public void testAddNewOrderNotNull() throws Exception {
			String orderDate="10Jul19", requireDate="13Jul19", shipDate="18Jul19";
			GLCC_Orders order = new GLCC_Orders("PO912",orderDate, requireDate,shipDate, "321", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),custId);
		}
		
		@Test
		public void testAddNewOrder() throws Exception {
			String orderDate="10Jul19", requireDate="13Jul19", shipDate="18Jul19";
//			orderDate = dateFormat.parse("07/04/2019");
//			requireDate = dateFormat.parse("07-15-2019");
//			shipDate = dateFormat.parse("07-06-2019");
			GLCC_Orders order = new GLCC_Orders("PO652",orderDate, requireDate,shipDate, "321", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			//Mockito.when(orderRepository..thenReturn(order));
			//asserThat(service.getById.isEqualTo(order));
			//assertFalse(queryResult.isEmpty());
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),custId);
//	        assertEquals(order.getOrderNumber(),order.getOrderNumber());
//	        assertEquals(order.getRequireddate(),order1.getRequireddate());
//	        assertEquals(order.getStatus(),order1.getStatus());
//	        assertEquals(order.getShippeddate(), order1.getShippeddate());
		}
		
		@Test
		public void testAddOrderDateNull() throws Exception {
			String orderDate= null, requireDate="13Jul19", shipDate="18Jul19";

			GLCC_Orders order = new GLCC_Orders("PO312",orderDate, requireDate,shipDate, "321", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),custId);

		}
		
		@Test
		public void testAddOrderNullCustomerId() throws Exception {
			String orderDate="10Jul19", requireDate="13Jul19", shipDate="18Jul19";
//			orderDate = dateFormat.parse("07/04/2019");
//			requireDate = dateFormat.parse("07-15-2019");
//			shipDate = dateFormat.parse("07-06-2019");
			GLCC_Orders order = new GLCC_Orders("PO002",orderDate, requireDate,shipDate, null, 2.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			//Mockito.when(orderRepository..thenReturn(order));
			//asserThat(service.getById.isEqualTo(order));
			//assertFalse(queryResult.isEmpty());
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),null);
		}
		
		@Test
		public void testAddOrderNullOrderNumber() throws Exception {
			String orderDate="10Jul19", requireDate="13Jul19", shipDate="18Jul19";
			GLCC_Orders order = new GLCC_Orders(null,orderDate, requireDate,shipDate, "212", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			String orderId = "";
			for(GLCC_Orders orderList : orders)
			{
				orderId = orderList.getOrderNumber();
				if(orderId.equals(null))
				{
					break;
				}
			}
	        assertNull(orderId);
//	        assertEquals(order.getOrderNumber(),order.getOrderNumber());
//	        assertEquals(order.getRequireddate(),order1.getRequireddate());
//	        assertEquals(order.getStatus(),order1.getStatus());
//	        assertEquals(order.getShippeddate(), order1.getShippeddate());
		}

		@Test
		public void testAddOrderRequireDateNull() throws Exception {
			String orderDate= "18Jul19", requireDate=null, shipDate="18Jul19";

			GLCC_Orders order = new GLCC_Orders("PO312",orderDate, requireDate,shipDate, "321", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),custId);

		}
		@Test
		public void testAddOrderShippedDateNull() throws Exception {
			String orderDate= "18Jul19", requireDate=null, shipDate="18Jul19";

			GLCC_Orders order = new GLCC_Orders("PO312",orderDate, requireDate,shipDate, "321", 4.5f, 0f, 820.82f, 3000.12f );
			orderRepository.save(order);
			List<GLCC_Orders> orders = new ArrayList<GLCC_Orders>();
			orders = orderRepository.findAll();
			String custId = "";
			for(GLCC_Orders orderList : orders)
			{
				custId = orderList.getCustId();
				if(custId.equals("321"))
				{
					break;
				}
			}
	        assertEquals(order.getCustId(),custId);

		}
}
