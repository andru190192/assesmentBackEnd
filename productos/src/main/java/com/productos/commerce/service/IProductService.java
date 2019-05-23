package com.productos.commerce.service;

import java.util.List;

import com.productos.commerce.entity.ProductEntity;

public interface IProductService {

	List<ProductEntity> findAll();

	void insertProduct(ProductEntity productEntity);
}
