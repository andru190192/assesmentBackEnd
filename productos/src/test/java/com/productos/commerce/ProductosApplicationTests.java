package com.productos.commerce;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;

import com.productos.commerce.entity.ProductEntity;
import com.productos.commerce.service.IProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductosApplicationTests {

	@Autowired
	@Lazy
	private IProductService productService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAll() {
		List<ProductEntity> products = this.productService.findAll();
		assertNotNull("No existen productos", products);
	}

	@Test
	public void testInsertProduct() {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductname("idTest");
		productEntity.setProductname("producto test");
		productEntity.setProductline("linea producto");
		productEntity.setProductscale("escale");
		productEntity.setProductvendor("venta test");
		productEntity.setProductdescription("desc test");
		productEntity.setQuantityinstock(10);
		productEntity.setBuyprice(123);
		productEntity.setMsrp(123443);
		productEntity.setRanking(4);

		this.productService.insertProduct(productEntity);

		assertNotNull(productEntity);

	}

}
