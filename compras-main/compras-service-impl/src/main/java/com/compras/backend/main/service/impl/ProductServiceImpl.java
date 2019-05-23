package com.compras.backend.main.service.impl;


import com.compras.backend.compras.service.ProductService;
import com.compras.backend.domain.model.Product;
import com.compras.backend.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
