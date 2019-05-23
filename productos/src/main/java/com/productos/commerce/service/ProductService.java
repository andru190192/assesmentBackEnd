package com.productos.commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productos.commerce.entity.ProductEntity;
import com.productos.commerce.repository.IProductRepository;

@Transactional
@Lazy
@Service
public class ProductService implements IProductService {

	@Autowired
	@Lazy
	private IProductRepository productRepository;

	@Override
	@Transactional
	public List<ProductEntity> findAll() {
		return productRepository.findAll();
	}

	@Override
	@Transactional
	public void insertProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
	}
}
