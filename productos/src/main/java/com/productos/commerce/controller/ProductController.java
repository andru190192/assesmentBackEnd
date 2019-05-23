package com.productos.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.commerce.entity.ProductEntity;
import com.productos.commerce.service.IProductService;

@RestController
@Lazy
@RequestMapping("/product")
public class ProductController {

	@Autowired
	@Lazy
	private IProductService productService;

	@GetMapping("/findAll")
	public List<ProductEntity> findProducts() {
		return this.productService.findAll();
	}

	@PostMapping("/insertProduct")
	public void insertProduct(@RequestBody ProductEntity productEntity) {
		this.productService.insertProduct(productEntity);
	}
}
