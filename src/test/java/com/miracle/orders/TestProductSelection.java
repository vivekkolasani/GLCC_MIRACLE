package com.miracle.orders;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.miracle.orders.model.GLCC_Product;
import com.miracle.orders.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProductSelection {

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testProductname() {
		GLCC_Product glcc_Product;
		glcc_Product = productRepository.findById("2000").get();
		String productName = glcc_Product.getProductName();
		assertEquals("COKE",productName);
		
	}
	
	@Test
	public void productNameNotNull()
	{
		GLCC_Product glcc_Product;
		glcc_Product = productRepository.findById("1007").get();
		String productName = glcc_Product.getProductName();
		assertNotNull("COKE",productName);
	}
	
	@Test
	public void testProductCategory()
	{
		List<GLCC_Product> product = productRepository.findAll();
		
		String category = "";
		for(GLCC_Product p: product)
			
		{
			category = 	p.getCategory();
			if(category.equals("BEVERAGES")) {
				break;
			}
			//assertNotNull( null, glcc_Product.get().productName);
		}
		assertEquals("BEVERAGES",category);
	}
	
	@Test
	public void testProductCategoryNotNull()
	{
		List<GLCC_Product> product = productRepository.findAll();
		//glcc_Product.setProductName("COKE");
		//glcc_Product.n
		String category = "";
//		List<String> result = new ArrayList<>();
//		result = product.stream()                // Stream<Object>
//			    .filter(String.class::isInstance) // Stream<Object>
//			    .map(String.class::cast)          // Stream<String>
//			    .collect(Collectors.toList());
		for(GLCC_Product p: product)
		{
			category = 	p.getCategory();
			if(category.equals("BEVERAGES"))
			{
				break;
			}
		}
		assertNotNull("BEVERAGES",category);
	}
	
	@Test
	public void testProductPriceNotNull()
	{
		GLCC_Product glcc_Product;
		glcc_Product = productRepository.findById("1008").get();
		float price = glcc_Product.getPrice();
		assertNotNull(price);
	}
	

	@Test
	public void testProductPrice()
	{
		GLCC_Product glcc_Product;
		glcc_Product = productRepository.findById("1010").get();
		float productPrice = glcc_Product.getPrice();
		String price = Float.toString(productPrice);
		
		assertEquals("4.68",price);

		
		
	}
	
	
	
}
