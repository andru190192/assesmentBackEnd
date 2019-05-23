package com.lcampoverde.demo.services;

import com.lcampoverde.demo.client.Service.ProductService;
import com.lcampoverde.demo.client.dto.Product;
import com.lcampoverde.demo.client.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
