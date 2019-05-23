/**
 * 
 */
package com.ian.erp.modules.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ian.erp.modules.products.entity.ProductEntity;
import com.ian.erp.modules.products.repository.ProductService;

/**
 * @author Ian
 *
 */
@RestController
public class ProductController {

	@Autowired
	@Lazy
	private ProductService productService;

	@PostMapping("/provider/findAll")
	public List<ProductEntity> findAll() {
		return productService.findAll();
	}
}
