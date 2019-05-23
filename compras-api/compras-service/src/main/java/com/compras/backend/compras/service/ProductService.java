package com.compras.backend.compras.service;

import com.compras.backend.domain.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
}
