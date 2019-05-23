/**
 * 
 */
package com.ian.erp.modules.products.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ian.erp.modules.products.entity.ProductEntity;

/**
 * @author Ian
 *
 */
@Service
@Lazy
public class ProductService {
	
	@Autowired
	@Lazy
	private ProductRepository productRepository;
	
	public List<ProductEntity> findAll() {
		return productRepository.findAll();
	}
}
