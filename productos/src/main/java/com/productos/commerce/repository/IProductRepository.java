package com.productos.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productos.commerce.entity.ProductEntity;

public interface IProductRepository extends JpaRepository<ProductEntity, String> {

}
